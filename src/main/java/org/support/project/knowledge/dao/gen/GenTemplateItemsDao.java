package org.support.project.knowledge.dao.gen;

import java.util.List;

import java.sql.Timestamp;


import org.support.project.knowledge.entity.TemplateItemsEntity;
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
 * テンプレートの項目
 * this class is auto generate and not edit.
 * if modify dao method, you can edit TemplateItemsDao.
 */
@DI(instance = Instance.Singleton)
public class GenTemplateItemsDao extends AbstractDao {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static GenTemplateItemsDao get() {
        return Container.getComp(GenTemplateItemsDao.class);
    }

    /**
     * Select all data.
     * @return all data
     */
    public List<TemplateItemsEntity> physicalSelectAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_physical_select_all.sql");
        return executeQueryList(sql, TemplateItemsEntity.class);
    }
    /**
     * Select all data with pager.
     * @param limit limit
     * @param offset offset
     * @return all data on limit and offset
     */
    public List<TemplateItemsEntity> physicalSelectAllWithPager(int limit, int offset) { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_physical_select_all_with_pager.sql");
        return executeQueryList(sql, TemplateItemsEntity.class, limit, offset);
    }
    /**
     * Select data on key.
     * @param  itemNo itemNo
     * @param  typeId typeId
     * @return data
     */
    public TemplateItemsEntity physicalSelectOnKey(Integer itemNo, Integer typeId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_physical_select_on_key.sql");
        return executeQuerySingle(sql, TemplateItemsEntity.class, itemNo, typeId);
    }
    /**
     * Select all data that not deleted.
     * @return all data
     */
    public List<TemplateItemsEntity> selectAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_select_all.sql");
        return executeQueryList(sql, TemplateItemsEntity.class);
    }
    /**
     * Select all data that not deleted with pager.
     * @param limit limit
     * @param offset offset
     * @return all data
     */
    public List<TemplateItemsEntity> selectAllWidthPager(int limit, int offset) { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_select_all_with_pager.sql");
        return executeQueryList(sql, TemplateItemsEntity.class, limit, offset);
    }
    /**
     * Select count that not deleted.
     * @return count
     */
    public Integer selectCountAll() { 
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_select_count_all.sql");
        return executeQuerySingle(sql, Integer.class);
    }
    /**
     * Select data that not deleted on key.
     * @param  itemNo itemNo
     * @param  typeId typeId
     * @return data
     */
    public TemplateItemsEntity selectOnKey(Integer itemNo, Integer typeId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_select_on_key.sql");
        return executeQuerySingle(sql, TemplateItemsEntity.class, itemNo, typeId);
    }
    /**
     * Select data that not deleted on ITEM_NO column.
     * @param itemNo itemNo
     * @return list
     */
    public List<TemplateItemsEntity> selectOnItemNo(Integer itemNo) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_select_on_item_no.sql");
        return executeQueryList(sql, TemplateItemsEntity.class, itemNo);
    }
    /**
     * Select data that not deleted on TYPE_ID column.
     * @param typeId typeId
     * @return list
     */
    public List<TemplateItemsEntity> selectOnTypeId(Integer typeId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_select_on_type_id.sql");
        return executeQueryList(sql, TemplateItemsEntity.class, typeId);
    }
    /**
     * Select data on ITEM_NO column.
     * @param itemNo itemNo
     * @return list
     */
    public List<TemplateItemsEntity> physicalSelectOnItemNo(Integer itemNo) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_physical_select_on_item_no.sql");
        return executeQueryList(sql, TemplateItemsEntity.class, itemNo);
    }
    /**
     * Select data on TYPE_ID column.
     * @param typeId typeId
     * @return list
     */
    public List<TemplateItemsEntity> physicalSelectOnTypeId(Integer typeId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_physical_select_on_type_id.sql");
        return executeQueryList(sql, TemplateItemsEntity.class, typeId);
    }
    /**
     * Count all data
     * @return count
     */
    public int physicalCountAll() {
        String sql = "SELECT COUNT(*) FROM TEMPLATE_ITEMS";
        return executeQuerySingle(sql, Integer.class);
    }
    /**
     * Physical Insert.
     * it is not create key on database sequence.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public TemplateItemsEntity rawPhysicalInsert(TemplateItemsEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_raw_insert.sql");
        executeUpdate(sql, 
            entity.getItemNo(), 
            entity.getTypeId(), 
            entity.getItemName(), 
            entity.getItemType(), 
            entity.getDescription(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag());
        return entity;
    }
    /**
     * Physical Insert.
     * if key column have sequence, key value create by database.
     * @param entity entity
     * @return saved entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public TemplateItemsEntity physicalInsert(TemplateItemsEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_insert.sql");
        executeUpdate(sql, 
            entity.getItemNo(), 
            entity.getTypeId(), 
            entity.getItemName(), 
            entity.getItemType(), 
            entity.getDescription(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag());
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
    public TemplateItemsEntity insert(Integer user, TemplateItemsEntity entity) {
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
    public TemplateItemsEntity insert(TemplateItemsEntity entity) {
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
    public TemplateItemsEntity physicalUpdate(TemplateItemsEntity entity) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_update.sql");
        executeUpdate(sql, 
            entity.getItemName(), 
            entity.getItemType(), 
            entity.getDescription(), 
            entity.getInsertUser(), 
            entity.getInsertDatetime(), 
            entity.getUpdateUser(), 
            entity.getUpdateDatetime(), 
            entity.getDeleteFlag(), 
            entity.getItemNo(), 
            entity.getTypeId());
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
    public TemplateItemsEntity update(Integer user, TemplateItemsEntity entity) {
        TemplateItemsEntity db = selectOnKey(entity.getItemNo(), entity.getTypeId());
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
    public TemplateItemsEntity update(TemplateItemsEntity entity) {
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
    public TemplateItemsEntity save(Integer user, TemplateItemsEntity entity) {
        TemplateItemsEntity db = selectOnKey(entity.getItemNo(), entity.getTypeId());
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
    public TemplateItemsEntity save(TemplateItemsEntity entity) {
        TemplateItemsEntity db = selectOnKey(entity.getItemNo(), entity.getTypeId());
        if (db == null) {
            return insert(entity);
        } else {
            return update(entity);
        }
    }
    /**
     * Physical Delete.
     * @param  itemNo itemNo
     * @param  typeId typeId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void physicalDelete(Integer itemNo, Integer typeId) {
        String sql = SQLManager.getInstance().getSql("/org/support/project/knowledge/dao/sql/TemplateItemsDao/TemplateItemsDao_delete.sql");
        executeUpdate(sql, itemNo, typeId);
    }
    /**
     * Physical Delete.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void physicalDelete(TemplateItemsEntity entity) {
        physicalDelete(entity.getItemNo(), entity.getTypeId());

    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param user saved userid
     * @param  itemNo itemNo
     * @param  typeId typeId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Integer user, Integer itemNo, Integer typeId) {
        TemplateItemsEntity db = selectOnKey(itemNo, typeId);
        db.setDeleteFlag(1);
        db.setUpdateUser(user);
        db.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        physicalUpdate(db);
    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * @param  itemNo itemNo
     * @param  typeId typeId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Integer itemNo, Integer typeId) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer user = (Integer) pool.getUser();
        delete(user, itemNo, typeId);
    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(Integer user, TemplateItemsEntity entity) {
        delete(user, entity.getItemNo(), entity.getTypeId());

    }
    /**
     * Delete.
     * if delete flag is exists, the data is logical delete.
     * set saved user id.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void delete(TemplateItemsEntity entity) {
        delete(entity.getItemNo(), entity.getTypeId());

    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * set saved user id.
     * @param user saved userid
     * @param  itemNo itemNo
     * @param  typeId typeId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Integer user, Integer itemNo, Integer typeId) {
        TemplateItemsEntity db = physicalSelectOnKey(itemNo, typeId);
        db.setDeleteFlag(0);
        db.setUpdateUser(user);
        db.setUpdateDatetime(new Timestamp(new java.util.Date().getTime()));
        physicalUpdate(db);
    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * @param  itemNo itemNo
     * @param  typeId typeId
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Integer itemNo, Integer typeId) {
        DBUserPool pool = Container.getComp(DBUserPool.class);
        Integer user = (Integer) pool.getUser();
        activation(user, itemNo, typeId);
    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * set saved user id.
     * @param user saved userid
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(Integer user, TemplateItemsEntity entity) {
        activation(user, entity.getItemNo(), entity.getTypeId());

    }
    /**
     * Ativation.
     * if delete flag is exists and delete flag is true, delete flug is false to activate.
     * @param entity entity
     */
    @Aspect(advice = org.support.project.ormapping.transaction.Transaction.class)
    public void activation(TemplateItemsEntity entity) {
        activation(entity.getItemNo(), entity.getTypeId());

    }

}
