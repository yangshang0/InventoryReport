create table ACCOUNTMT (
ID			NUMBER(5)    PRIMARY KEY,
USER_NAME   VARCHAR2(40) NOT NULL,
PASSWORD    VARCHAR2(40) NOT NULL,
EMAIL       VARCHAR2(50) NOT NULL,
CREATE_DATE DATE,
ENABLED     VARCHAR2(1) DEFAULT 'Y'
)


create sequence accountmt_seq
INCREMENT BY 1
NOCACHE
NOCYCLE;


--commit;