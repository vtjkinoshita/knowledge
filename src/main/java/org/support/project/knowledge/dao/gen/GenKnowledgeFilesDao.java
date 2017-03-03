package org.support.project.knowledge.dao.gen;

import java.util.List;

import java.io.InputStream;
import java.sql.Timestamp;


import org.support.project.knowledge.entity.KnowledgeFilesEntity;
import org.support.project.ormapping.dao.AbstractDao;
import org.support.project.ormapping.exception.ORMappingException;
import org.support.project.ormapping.common.SQLManager;
import org.support.project.ormapping.common.DBUserPool;
import org.support.project.ormapping.common.IDGen;
import org.support.project.ormapping.config.ORMappingParameter;
import org.support.project.ormapping.connection.ConnectionManager;
import org.support.project.common.util.PropertyUtil;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.aop.Aspect;

/**
 * 添付ファイル
 * this class is auto generate and not edit.
 * if modify dao method, you can edit KnowledgeFilesDao.
 */
@DI(instance = Instance.Singleton)
public class GenKnowledgeFilesDao extends AbstractDao {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static GenKnowledgeFilesDao get() {
        return Container.getComp(GenKnowledgeFilesDao.class);
    }

    /**
     * Select all data.
     * @return all data
     */
    public List<KnowledgeFilesEntity> physicalSelectAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_physical_select_all.sql");
        return executeQueryList(sql, KnowledgeFilesEntity.class);
    }
    /**
     * Select all data with pager.
     * @param limit limit
     * @param offset offset
     * @return all data on limit and offset
     */
    public List<KnowledgeFilesEntity> physicalSelectAllWithPager(int limit, int offset) { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_physical_select_all_with_pager.sql");
        return executeQueryList(sql, KnowledgeFilesEntity.class, limit, offset);
    }
    /**
     * Select data on key.
     * @param  fileNo fileNo
     * @return data
     */
    public KnowledgeFilesEntity physicalSelectOnKey(Long fileNo) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_physical_select_on_key.sql");
        return executeQuerySingle(sql, KnowledgeFilesEntity.class, fileNo);
    }
    /**
     * Select all data that not deleted.
     * @return all data
     */
    public List<KnowledgeFilesEntity> selectAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_select_all.sql");
        return executeQueryList(sql, KnowledgeFilesEntity.class);
    }
    /**
     * Select all data that not deleted with pager.
     * @param limit limit
     * @param offset offset
     * @return all data
     */
    public List<KnowledgeFilesEntity> selectAllWidthPager(int limit, int offset) { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_select_all_with_pager.sql");
        return executeQueryList(sql, KnowledgeFilesEntity.class, limit, offset);
    }
    /**
     * Select count that not deleted.
     * @return count
     */
    public Integer selectCountAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_select_count_all.sql");
        return executeQuerySingle(sql, Integer.class);
    }
    /**
     * Select data that not deleted on key.
     * @param  fileNo fileNo
     * @return data
     */
    public KnowledgeFilesEntity selectOnKey(Long fileNo) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_select_on_key.sql");
        return executeQuerySingle(sql, KnowledgeFilesEntity.class, fileNo);
    }
    /**
     * Count all data
     * @return count
     */
    public int physicalCountAll() {
        String sql = "SELECT COUNT(*) FROM KNOWLEDGE_FILES";
        return executeQuerySingle(sql, Integer.class);
    }
    /**
     * Physical Insert.
     * it is not create key on database sequence.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity rawPhysicalInsert(KnowledgeFilesEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_raw_insert.sql");
        executeUpdate(sql, 
            entity.getFileNo(), 
            entity.getKnowledgeId(), 
            entity.getCommentNo(), 
            entity.getDraftId(), 
            entity.getFileName(), 
            entity.getFileSize(), 
            entity.getFileBinary(), 
            entity.getParseStatus(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag());
        String driverClass = ConnectionManager.getInstance().getDriverClass(getConnectionName());
        if (ORMappingParameter.DRIVER_NAME_POSTGRESQL.equals(driverClass)) {
            String setValSql = "select setval('KNOWLEDGE_FILES_FILE_NO_seq', (select max(FILE_NO) from KNOWLEDGE_FILES));";
            executeQuerySingle(setValSql, Long.class);
        }
        return entity;
    }
    /**
     * Physical Insert.
     * if key column have sequence, key value create by database.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity physicalInsert(KnowledgeFilesEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_insert.sql");
        Class<?> type = PropertyUtil.getPropertyType(entity, "fileNo");
        Object key = executeInsert(sql, type, 
            entity.getKnowledgeId(), 
            entity.getCommentNo(), 
            entity.getDraftId(), 
            entity.getFileName(), 
            entity.getFileSize(), 
            entity.getFileBinary(), 
            entity.getParseStatus(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag());
        PropertyUtil.setPropertyValue(entity, "fileNo", key);
        return entity;
    }
    /**
     * Insert.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity insert(Integer user, KnowledgeFilesEntity entity) {
        entity.setInsertUser(user);
        entity.setInsertDatetime(new Timestamp(new java.util.Date().getTime()));
        entity.setUpdateUser(user);
        entity.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        entity.setDeleteFlag(0);
        return physicalInsert(entity);
    }
    /**
     * Insert.
     * saved user id is auto set.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity insert(KnowledgeFilesEntity entity) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer userId = (Integer) pool.getUser();
        return insert(userId, entity);
    }
    /**
     * Physical Update.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity physicalUpdate(KnowledgeFilesEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_update.sql");
        executeUpdate(sql, 
            entity.getKnowledgeId(), 
            entity.getCommentNo(), 
            entity.getDraftId(), 
            entity.getFileName(), 
            entity.getFileSize(), 
            entity.getFileBinary(), 
            entity.getParseStatus(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag(), 
            entity.getFileNo());
        return entity;
    }
    /**
     * Update.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity update(Integer user, KnowledgeFilesEntity entity) {
        KnowledgeFilesEntity db = selectOnKey(entity.getFileNo());
        entity.setInsertUser(db.getInsertUser());
        entity.setInsertDatetime(db.getInsertDatetime());
        entity.setDeleteFlag(db.getDeleteFlag());
        entity.setUpdateUser(user);
        entity.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        return physicalUpdate(entity);
    }
    /**
     * Update.
     * saved user id is auto set.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity update(KnowledgeFilesEntity entity) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer userId = (Integer) pool.getUser();
        return update(userId, entity);
    }
    /**
     * Save. 
     * if same key data is exists, the data is update. otherwise the data is insert.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity save(Integer user, KnowledgeFilesEntity entity) {
        KnowledgeFilesEntity db = selectOnKey(entity.getFileNo());
        if (db == null) {
            return insert(user, entity);
        } else {
            return update(user, entity);
        }
    }
    /**
     * Save. 
     * if same key data is exists, the data is update. otherwise the data is insert.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public KnowledgeFilesEntity save(KnowledgeFilesEntity entity) {
        KnowledgeFilesEntity db = selectOnKey(entity.getFileNo());
        if (db == null) {
            return insert(entity);
        } else {
            return update(entity);
        }
    }
    /**
     * Physical Delete.
     * @param  fileNo fileNo
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void physicalDelete(Long fileNo) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/KnowledgeFilesDao/KnowledgeFilesDao_delete.sql");
        executeUpdate(sql, fileNo);
    }
    /**
     * Physical Delete.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void physicalDelete(KnowledgeFilesEntity entity) {
        physicalDelete(entity.getFileNo());

    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param user saved userid
     * @param  fileNo fileNo
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Integer user, Long fileNo) {
        KnowledgeFilesEntity db = selectOnKey(fileNo);
        db.setDeleteFlag(1);
        db.setUpdateUser(user);
        db.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        physicalUpdate(db);
    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * @param  fileNo fileNo
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Long fileNo) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer user = (Integer) pool.getUser();
        delete(user, fileNo);
    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Integer user, KnowledgeFilesEntity entity) {
        delete(user, entity.getFileNo());

    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(KnowledgeFilesEntity entity) {
        delete(entity.getFileNo());

    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * set saved user id.
     * @param user saved userid
     * @param  fileNo fileNo
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Integer user, Long fileNo) {
        KnowledgeFilesEntity db = physicalSelectOnKey(fileNo);
        db.setDeleteFlag(0);
        db.setUpdateUser(user);
        db.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        physicalUpdate(db);
    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * @param  fileNo fileNo
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Long fileNo) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer user = (Integer) pool.getUser();
        activation(user, fileNo);
    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Integer user, KnowledgeFilesEntity entity) {
        activation(user, entity.getFileNo());

    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(KnowledgeFilesEntity entity) {
        activation(entity.getFileNo());

    }

}
