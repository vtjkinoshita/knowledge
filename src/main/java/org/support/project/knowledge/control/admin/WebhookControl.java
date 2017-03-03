package org.support.project.knowledge.control.admin;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.support.project.common.bean.ValidateError;
import org.support.project.common.log.Log;
import org.support.project.common.log.LogFactory;
import org.support.project.knowledge.config.AppConfig;
import org.support.project.knowledge.control.Control;
import org.support.project.knowledge.dao.WebhookConfigsDao;
import org.support.project.knowledge.entity.WebhookConfigsEntity;
import org.support.project.knowledge.logic.WebhookLogic;
import org.support.project.web.annotation.Auth;
import org.support.project.web.boundary.Boundary;
import org.support.project.web.control.service.Get;
import org.support.project.web.control.service.Post;
import org.support.project.web.dao.ProxyConfigsDao;
import org.support.project.web.entity.ProxyConfigsEntity;

public class WebhookControl extends Control {
    /** ログ */
    private static final Log LOG = LogFactory.getLog(WebhookControl.class);

    /**
     * 設定画面を表示
     * 
     * @return
     */
    @Get(publishToken = "admin")
    @Auth(roles = "admin")
    public Boundary config() {
        WebhookConfigsDao dao = WebhookConfigsDao.get();
        List<WebhookConfigsEntity> webhookConfigsEntities = dao.selectAll();
        setAttribute("webhookConfigsEntities", webhookConfigsEntities);
        setAttribute("webhookConfigsEntitiesCount", webhookConfigsEntities.size());
        return forward("config.jsp");
    }

    @Post(subscribeToken = "admin")
    @Auth(roles = "admin")
    public Boundary save() throws Exception {
        WebhookConfigsDao dao = WebhookConfigsDao.get();

        String[] hooks = getParam("hooks[]", String[].class);
        String url = getParam("url");

        Map<String, String> entityParam = new HashMap<String, String>();
        List<ValidateError> errors = new ArrayList<>();

        if (hooks == null) {
            WebhookConfigsEntity entity = WebhookConfigsEntity.get();
            entityParam.put("url", url);

            errors.addAll(entity.validate(entityParam));
            if (!errors.isEmpty()) {
                setResult(null, errors);
                return config();
            }
        } else {
            for (String hook : hooks) {
                WebhookConfigsEntity entity = WebhookConfigsEntity.get();
                entityParam.put("hook", hook);
                entityParam.put("url", url);

                errors.addAll(entity.validate(entityParam));
                if (!errors.isEmpty()) {
                    setResult(null, errors);
                    return config();
                }

                entity.setUrl(url);
                entity.setHook(hook);
                dao.save(entity);
            }
        }
        String successMsg = "message.success.save";
        setResult(successMsg, errors);
        return config();
    }

    @Post(subscribeToken = "admin")
    @Auth(roles = "admin")
    public Boundary test() throws Exception {
        ProxyConfigsDao proxyConfigDao = ProxyConfigsDao.get();
        ProxyConfigsEntity proxyConfig = proxyConfigDao.selectOnKey(AppConfig.get().getSystemName());

        WebhookConfigsDao webhookConfigDao = WebhookConfigsDao.get();
        WebhookConfigsEntity webhookConfig = webhookConfigDao.selectOnKey(new Integer(getParam("hook_id")));

        if (null == webhookConfig) {
            addMsgError("knowledge.webhook.test.error");
            return config();
        }

        try {
            InputStream is = getClass().getResourceAsStream(webhookConfig.resourcePath());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str;
            String json = "";
            while ((str = br.readLine()) != null) {
                json += str;
            }

            WebhookLogic.get().notify(proxyConfig, webhookConfig, json);
            addMsgInfo("knowledge.webhook.test.success");
        } catch (Exception e) {
            LOG.error(e.getMessage());
            addMsgError("knowledge.webhook.test.error");
        }

        return config();
    }

    @Post(subscribeToken = "admin")
    @Auth(roles = "admin")
    public Boundary delete() throws Exception {
        WebhookConfigsDao dao = WebhookConfigsDao.get();
        try {
            dao.delete(new Integer(getParam("hook_id")));

            addMsgInfo("knowledge.webhook.delete.success");
        } catch (Exception e) {
            LOG.error(e.getMessage());
            addMsgError("knowledge.webhook.delete.error");
        }

        return config();
    }
}