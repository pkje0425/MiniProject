DROP TABLE SHOP
CASCADE CONSTRAINT;

DROP SEQUENCE PRODUCT_SEQ;

CREATE TABLE SHOP(		/* 상품 테이블 */
	PRODUCT_SEQ NUMBER(5) PRIMARY KEY,	/* like SEQ */
	CODE_NUMBER VARCHAR2(20) NOT NULL,	/* 대분류 ex) 의류:01, 악세사리:02, CD:03 ... */
	PRODUCT_NAME VARCHAR2(200) NOT NULL,
	PRICE NUMBER(8) NOT NULL,
	PRODUCT_EXPLAIN VARCHAR2(4000) NOT NULL,
	PRODUCT_IMAGE VARCHAR2(1000) NOT NULL,
	
	COUNT_S VARCHAR2(30),  /* 의류의 경우에만 기입 NULL 가능 */
	COUNT_M VARCHAR2(30),
	COUNT_L VARCHAR2(30),
	COUNT_O VARCHAR2(30),
	PRODUCT_SIZE VARCHAR2(100) NOT NULL
);


CREATE SEQUENCE PRODUCT_SEQ
START WITH 1
INCREMENT BY 1;



SELECT *
FROM SHOP;



SELECT COUNT(*)   
FROM SHOP
GROUP BY PRODUCT_NAME
HAVING PRODUCT_NAME LIKE '%번%';

SELECT PRODUCT_SEQ, CODE_NUMBER, PRODUCT_NAME, STOCK_COUNT, PRICE, PRODUCT_EXPLAIN,
		PRODUCT_IMAGE, PRODUCT_SIZE
FROM (SELECT ROW_NUMBER() OVER(ORDER BY PRODUCT_SEQ DESC) AS RNUM,
		PRODUCT_SEQ, CODE_NUMBER, PRODUCT_NAME, STOCK_COUNT, PRICE, PRODUCT_EXPLAIN,
		PRODUCT_IMAGE, PRODUCT_SIZE
		FROM SHOP
		WHERE CODE_NUMBER='의류')
WHERE RNUM = 1



SELECT COUNT(*)
FROM SHOP
WHERE 1=1