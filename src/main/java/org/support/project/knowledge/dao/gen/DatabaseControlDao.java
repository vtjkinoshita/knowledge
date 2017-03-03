package org.support.project.knowledge.dao.gen;

import org.support.project.ormapping.dao.AbstractDao;
import org.support.project.common.log.Log;
import org.support.project.common.log.LogFactory;
import org.support.project.di.DI;
import org.support.project.di.Instance;

/**
 * テンプレートの項目
 * this class is auto generate and not edit.
 */
@DI(instance = Instance.Singleton)
public class DatabaseControlDao extends AbstractDao {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;
    /** LOG */
    private static final Log LOG = LogFactory.getLog(DatabaseControlDao.class);

    /** Drop all tables */
    public void dropAllTable() {
        String[] sqls = new String[30];
        sqls[0] = "DROP TABLE IF EXISTS KNOWLEDGES CASCADE;";
        sqls[1] = "DROP TABLE IF EXISTS ACCOUNT_IMAGES CASCADE;";
        sqls[2] = "DROP TABLE IF EXISTS MAIL_POSTS CASCADE;";
        sqls[3] = "DROP TABLE IF EXISTS WEBHOOK_CONFIGS CASCADE;";
        sqls[4] = "DROP TABLE IF EXISTS VOTES CASCADE;";
        sqls[5] = "DROP TABLE IF EXISTS COMMENTS CASCADE;";
        sqls[6] = "DROP TABLE IF EXISTS KNOWLEDGE_GROUPS CASCADE;";
        sqls[7] = "DROP TABLE IF EXISTS MAIL_HOOK_CONDITIONS CASCADE;";
        sqls[8] = "DROP TABLE IF EXISTS LIKES CASCADE;";
        sqls[9] = "DROP TABLE IF EXISTS DRAFT_ITEM_VALUES CASCADE;";
        sqls[10] = "DROP TABLE IF EXISTS VIEW_HISTORIES CASCADE;";
        sqls[11] = "DROP TABLE IF EXISTS KNOWLEDGE_EDIT_GROUPS CASCADE;";
        sqls[12] = "DROP TABLE IF EXISTS WEBHOOKS CASCADE;";
        sqls[13] = "DROP TABLE IF EXISTS KNOWLEDGE_FILES CASCADE;";
        sqls[14] = "DROP TABLE IF EXISTS NOTIFY_QUEUES CASCADE;";
        sqls[15] = "DROP TABLE IF EXISTS TEMPLATE_MASTERS CASCADE;";
        sqls[16] = "DROP TABLE IF EXISTS ITEM_CHOICES CASCADE;";
        sqls[17] = "DROP TABLE IF EXISTS KNOWLEDGE_EDIT_USERS CASCADE;";
        sqls[18] = "DROP TABLE IF EXISTS PINS CASCADE;";
        sqls[19] = "DROP TABLE IF EXISTS KNOWLEDGE_HISTORIES CASCADE;";
        sqls[20] = "DROP TABLE IF EXISTS KNOWLEDGE_ITEM_VALUES CASCADE;";
        sqls[21] = "DROP TABLE IF EXISTS KNOWLEDGE_TAGS CASCADE;";
        sqls[22] = "DROP TABLE IF EXISTS NOTIFY_CONFIGS CASCADE;";
        sqls[23] = "DROP TABLE IF EXISTS MAIL_HOOKS CASCADE;";
        sqls[24] = "DROP TABLE IF EXISTS DRAFT_KNOWLEDGES CASCADE;";
        sqls[25] = "DROP TABLE IF EXISTS STOCKS CASCADE;";
        sqls[26] = "DROP TABLE IF EXISTS STOCK_KNOWLEDGES CASCADE;";
        sqls[27] = "DROP TABLE IF EXISTS KNOWLEDGE_USERS CASCADE;";
        sqls[28] = "DROP TABLE IF EXISTS TAGS CASCADE;";
        sqls[29] = "DROP TABLE IF EXISTS TEMPLATE_ITEMS CASCADE;";
        for (String sql : sqls) {
            LOG.debug(sql);
            executeUpdate(sql);
        }
    }
    /** Delete all table data */
    public void dropAllData() {
        String[] sqls = new String[30];
        sqls[0] = "TRUNCATE TABLE KNOWLEDGES;";
        sqls[1] = "TRUNCATE TABLE ACCOUNT_IMAGES;";
        sqls[2] = "TRUNCATE TABLE MAIL_POSTS;";
        sqls[3] = "TRUNCATE TABLE WEBHOOK_CONFIGS;";
        sqls[4] = "TRUNCATE TABLE VOTES;";
        sqls[5] = "TRUNCATE TABLE COMMENTS;";
        sqls[6] = "TRUNCATE TABLE KNOWLEDGE_GROUPS;";
        sqls[7] = "TRUNCATE TABLE MAIL_HOOK_CONDITIONS;";
        sqls[8] = "TRUNCATE TABLE LIKES;";
        sqls[9] = "TRUNCATE TABLE DRAFT_ITEM_VALUES;";
        sqls[10] = "TRUNCATE TABLE VIEW_HISTORIES;";
        sqls[11] = "TRUNCATE TABLE KNOWLEDGE_EDIT_GROUPS;";
        sqls[12] = "TRUNCATE TABLE WEBHOOKS;";
        sqls[13] = "TRUNCATE TABLE KNOWLEDGE_FILES;";
        sqls[14] = "TRUNCATE TABLE NOTIFY_QUEUES;";
        sqls[15] = "TRUNCATE TABLE TEMPLATE_MASTERS;";
        sqls[16] = "TRUNCATE TABLE ITEM_CHOICES;";
        sqls[17] = "TRUNCATE TABLE KNOWLEDGE_EDIT_USERS;";
        sqls[18] = "TRUNCATE TABLE PINS;";
        sqls[19] = "TRUNCATE TABLE KNOWLEDGE_HISTORIES;";
        sqls[20] = "TRUNCATE TABLE KNOWLEDGE_ITEM_VALUES;";
        sqls[21] = "TRUNCATE TABLE KNOWLEDGE_TAGS;";
        sqls[22] = "TRUNCATE TABLE NOTIFY_CONFIGS;";
        sqls[23] = "TRUNCATE TABLE MAIL_HOOKS;";
        sqls[24] = "TRUNCATE TABLE DRAFT_KNOWLEDGES;";
        sqls[25] = "TRUNCATE TABLE STOCKS;";
        sqls[26] = "TRUNCATE TABLE STOCK_KNOWLEDGES;";
        sqls[27] = "TRUNCATE TABLE KNOWLEDGE_USERS;";
        sqls[28] = "TRUNCATE TABLE TAGS;";
        sqls[29] = "TRUNCATE TABLE TEMPLATE_ITEMS;";
        for (String sql : sqls) {
            LOG.debug(sql);
            executeUpdate(sql);
        }
    }

}
