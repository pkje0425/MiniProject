
DROP TABLE POLL
CASCADE CONSTRAINTS;

DROP SEQUENCE POLL_SEQ;

CREATE TABLE POLL(
	POLLID NUMBER NOT NULL,
	ID VARCHAR2(50) NOT NULL,
	QUESTION VARCHAR2(50) NOT NULL,
	SDATE DATE NOT NULL,
	EDATE DATE NOT NULL,
	ITEMCOUNT NUMBER NOT NULL,
	POLLTOTAL NUMBER NOT NULL,
	REGDATE DATE NOT NULL,
	CONSTRAINT POLL_PK PRIMARY KEY(POLLID)
);

CREATE SEQUENCE POLL_SEQ
START WITH 1
INCREMENT BY 1;

ALTER TABLE POLL ADD CONSTRAINT POLL_FK
FOREIGN KEY(ID)
REFERENCES MEMBER2(ID);