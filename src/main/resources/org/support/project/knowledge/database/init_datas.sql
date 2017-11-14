INSERT INTO GROUPS ( GROUP_ID, GROUP_KEY, GROUP_NAME, DESCRIPTION, PARENT_GROUP_KEY, GROUP_CLASS, ROW_ID,
 INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
 VALUES (0,'g-all','ALL USERS','Group which all users belong',null,0,'g-all',0,'2015-07-04 00:00:00',null,null,0);

INSERT INTO TEMPLATE_MASTERS ( TYPE_ID, TYPE_NAME, TYPE_ICON, DESCRIPTION, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-100,'knowledge', 'fa-book', 'Share information written by Markdown',0,'2015-09-09 00:00:00',null,null,0);

INSERT INTO TEMPLATE_MASTERS ( TYPE_ID, TYPE_NAME, TYPE_ICON, DESCRIPTION, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-99,'bookmark', 'fa-bookmark', 'Share information about the URL',0,'2015-09-09 00:00:00',null,null,0);

INSERT INTO TEMPLATE_ITEMS ( TYPE_ID, ITEM_NO, ITEM_NAME, ITEM_TYPE, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-99,0,'URL',0,0,'2015-09-09 00:00:00',null,null,0);

INSERT INTO TEMPLATE_MASTERS ( TYPE_ID, TYPE_NAME, TYPE_ICON, DESCRIPTION, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-101,'event', 'fa-calendar', 'Share information about a event',0,'2017-02-16 00:00:00',null,null,0);

INSERT INTO TEMPLATE_MASTERS ( TYPE_ID, TYPE_NAME, TYPE_ICON, DESCRIPTION, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-102,'presentation', 'fa-television', 'It is presentation by Markdown',0,'2017-12-01 00:00:00',null,null,0);

INSERT INTO TEMPLATE_ITEMS ( TYPE_ID, ITEM_NO, ITEM_NAME, ITEM_TYPE, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-101,0,'Date',20,0,'2017-02-16 00:00:00',null,null,0);
INSERT INTO TEMPLATE_ITEMS ( TYPE_ID, ITEM_NO, ITEM_NAME, ITEM_TYPE, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-101,1,'Start',21,0,'2017-02-16 00:00:00',null,null,0);
INSERT INTO TEMPLATE_ITEMS ( TYPE_ID, ITEM_NO, ITEM_NAME, ITEM_TYPE, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-101,2,'End',21,0,'2017-02-16 00:00:00',null,null,0);
INSERT INTO TEMPLATE_ITEMS ( TYPE_ID, ITEM_NO, ITEM_NAME, ITEM_TYPE, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-101,3,'Timezone',22,0,'2017-02-16 00:00:00',null,null,0);
INSERT INTO TEMPLATE_ITEMS ( TYPE_ID, ITEM_NO, ITEM_NAME, ITEM_TYPE, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-101,4,'The number to be accepted',2,0,'2017-02-16 00:00:00',null,null,0);
INSERT INTO TEMPLATE_ITEMS ( TYPE_ID, ITEM_NO, ITEM_NAME, ITEM_TYPE, INSERT_USER, INSERT_DATETIME, UPDATE_USER, UPDATE_DATETIME, DELETE_FLAG ) 
VALUES (-101,5,'Place',0,0,'2017-02-16 00:00:00',null,null,0);

