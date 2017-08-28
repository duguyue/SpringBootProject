/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/8/28 18:23:07                           */
/*==============================================================*/


DROP TABLE IF EXISTS AFFAIR;

DROP TABLE IF EXISTS AFFAIR_TYPE;

DROP TABLE IF EXISTS EXPENSE;

DROP TABLE IF EXISTS EXPENSE_TYPE;

DROP TABLE IF EXISTS INCOME;

DROP TABLE IF EXISTS INCOME_TYPE;

DROP TABLE IF EXISTS NOTE_BOOK;

DROP TABLE IF EXISTS USER;

/*==============================================================*/
/* Table: AFFAIR                                                */
/*==============================================================*/
CREATE TABLE AFFAIR
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   USERID               VARCHAR(32) COMMENT '用户ID',
   CONTENT              VARCHAR(200) COMMENT '内容',
   PLANSTARTTIME        TIMESTAMP COMMENT '计划开始时间',
   PLANENDTIME          TIMESTAMP COMMENT '计划截止时间',
   RANK                 INT(1) COMMENT '重要等级',
   REMARK               VARCHAR(100) COMMENT '备注',
   BELONGTOTYPE         INT(11) COMMENT '所属事务类别ID',
   ALARMTIME            INT(11) COMMENT '提醒时间',
   NOTIFICATION_ID      INT(11) COMMENT '提醒通知ID',
   PRIMARY KEY (ID)
);

ALTER TABLE AFFAIR COMMENT '事务表';

/*==============================================================*/
/* Table: AFFAIR_TYPE                                           */
/*==============================================================*/
CREATE TABLE AFFAIR_TYPE
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   AFFAIRTYPE           VARCHAR(30) COMMENT '事务类别',
   PRIMARY KEY (ID)
);

ALTER TABLE AFFAIR_TYPE COMMENT '事务类别';

/*==============================================================*/
/* Table: EXPENSE                                               */
/*==============================================================*/
CREATE TABLE EXPENSE
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   USER_ID              VARCHAR(32) COMMENT '用户ID',
   EXPENSE_TYPE_ID      INT(11) COMMENT '支出类别ID',
   AMOUNT               NUMERIC(8,2) COMMENT '消费金额',
   PRIMARY KEY (ID)
);

ALTER TABLE EXPENSE COMMENT '用户消费支出表';

/*==============================================================*/
/* Table: EXPENSE_TYPE                                          */
/*==============================================================*/
CREATE TABLE EXPENSE_TYPE
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   USER_ID              VARCHAR(32) COMMENT '用户ID',
   EXPENSE_TYPE         VARCHAR(30) COMMENT '支出类别',
   PRIMARY KEY (ID)
);

ALTER TABLE EXPENSE_TYPE COMMENT '用户支出类别';

/*==============================================================*/
/* Table: INCOME                                                */
/*==============================================================*/
CREATE TABLE INCOME
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   USER_ID              VARCHAR(32) COMMENT '用户ID',
   INCOME_TYPE_ID       INT(11) COMMENT '收入类别ID',
   AMOUNT               NUMERIC(8,2) COMMENT '收入金额',
   PRIMARY KEY (ID)
);

ALTER TABLE INCOME COMMENT '用户收入表';

/*==============================================================*/
/* Table: INCOME_TYPE                                           */
/*==============================================================*/
CREATE TABLE INCOME_TYPE
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   USER_ID              VARCHAR(12) COMMENT '用户ID',
   INCOME_TYPE          VARCHAR(30) COMMENT '收入类别'
);

ALTER TABLE INCOME_TYPE COMMENT '用户收入类别';

/*==============================================================*/
/* Table: NOTE_BOOK                                             */
/*==============================================================*/
CREATE TABLE NOTE_BOOK
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   USER_ID              VARCHAR(32) COMMENT '用户ID',
   CONTENT              VARCHAR(200) COMMENT '内容',
   FLAG                 INT(1) COMMENT '是否加密',
   PRIMARY KEY (ID)
);

ALTER TABLE NOTE_BOOK COMMENT '记事本';

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
CREATE TABLE USER
(
   ID                   INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   USER_ID              VARCHAR(32) COMMENT '用户ID',
   USER_NAME            VARCHAR(32) COMMENT '用户名',
   PASSWORD             VARCHAR(32) COMMENT '密码',
   LAST_LOGIN           TIMESTAMP COMMENT '最后登录时间'
);

ALTER TABLE USER COMMENT '用户表';

