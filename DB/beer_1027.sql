/* 맥주 */
CREATE TABLE BEER (
	b_no VARCHAR2(200) NOT NULL, /* 맥주번호 */
	bname VARCHAR2(200) NOT NULL, /* 맥주이름 */
	AVU NUMBER NOT NULL, /* 도수 */
	type VARCHAR2(200) NOT NULL, /* 종류 */
	SRM NUMBER, /* 색깔 */
	IBU NUMBER, /* 쓴맛 */
	aroma VARCHAR2(200), /* 향 */
	photo VARCHAR2(200), /* 맥주사진 */
	br_name VARCHAR2(200) /* 브랜드명 */
);

ALTER TABLE BEER
	ADD
		CONSTRAINT PK_BEER
		PRIMARY KEY (
			b_no
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* 리뷰 */
CREATE TABLE REVIEW (
	r_no VARCHAR2(200) NOT NULL, /* 리뷰번호 */
	m_no VARCHAR2(200) NOT NULL, /* 회원번호 */
	b_no VARCHAR2(200) NOT NULL, /* 맥주번호 */
	review CLOB NOT NULL /* 맥주리뷰 */
);

ALTER TABLE REVIEW
	ADD
		CONSTRAINT PK_REVIEW
		PRIMARY KEY (
			r_no
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* 회원 */
CREATE TABLE MEMBER (
	m_no VARCHAR2(200) NOT NULL, /* 회원번호 */
	id VARCHAR2(200) NOT NULL, /* 아이디 */
	password VARCHAR2(200) NOT NULL, /* 비밀번호 */
	name VARCHAR2(200) NOT NULL, /* 이름 */
	birth DATE NOT NULL, /* 생년월일 */
	tel VARCHAR2(200), /* 전화번호 */
	addr VARCHAR2(200), /* 주소 */
	email VARCHAR2(200), /* 이메일 */
	job VARCHAR2(200), /* 직업 */
	point NUMBER DEFAULT 0 /* 포인트 */
);

ALTER TABLE MEMBER
	ADD
		CONSTRAINT PK_MEMBER
		PRIMARY KEY (
			m_no
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* Question */
CREATE TABLE QnA (
	q_no VARCHAR2(200) NOT NULL, /* 질문번호 */
	s_no VARCHAR2(200) NOT NULL, /* 맥주창고번호 */
	yesno VARCHAR2(200) DEFAULT 'n', /* 답변여부 */
	question CLOB NOT NULL, /* 질문내용 */
	answer CLOB DEFAULT '-' /* 답변내용 */
);

ALTER TABLE QnA
	ADD
		CONSTRAINT C_PK_QnA
		PRIMARY KEY (
			q_no,
			s_no
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* 리스트(추천,선호,위시) */
CREATE TABLE LIST (
	l_category VARCHAR2(200) NOT NULL, /* 리스트 종류 */
	s_no VARCHAR2(200) NOT NULL, /* 맥주창고번호 */
	b_no VARCHAR2(200) NOT NULL /* 맥주번호 */
);

ALTER TABLE LIST
	ADD
		CONSTRAINT C_PK_LIST
		PRIMARY KEY (
			l_category,
			s_no,
			b_no
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* 방명록 */
CREATE TABLE guestbook (
	g_no VARCHAR2(200) NOT NULL, /* 방명록번호 */
	s_no VARCHAR2(200) NOT NULL, /* 맥주창고번호 */
	m_no VARCHAR2(200) NOT NULL, /* 회원번호 */
	body CLOB NOT NULL /* 글내용 */
);

ALTER TABLE guestbook
	ADD
		CONSTRAINT C_PK_guestbook
		PRIMARY KEY (
			g_no,
			s_no
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* 브랜드 */
CREATE TABLE BRAND (
	br_name VARCHAR2(200) NOT NULL, /* 브랜드명 */
	country  VARCHAR2(200) NOT NULL /* 제조국가 */
);

ALTER TABLE BRAND
	ADD
		CONSTRAINT PK_BRAND
		PRIMARY KEY (
			br_name
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* 맥주창고 */
CREATE TABLE Storage (
	s_no VARCHAR2(200) NOT NULL, /* 맥주창고번호 */
	m_no VARCHAR2(200) NOT NULL, /* 회원번호 */
	photo VARCHAR2(200) DEFAULT '기본사진경로' /* 회원사진 */
);

ALTER TABLE Storage
	ADD
		CONSTRAINT PK_Storage
		PRIMARY KEY (
			s_no
		)
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

/* 등급 */
CREATE TABLE grade (
	gname VARCHAR2(200) DEFAULT '일반', /* 등급명 */
	lowpoint NUMBER NOT NULL, /* 최소점수 */
	highpoint NUMBER NOT NULL /* 최고점수 */
);

ALTER TABLE BEER
	ADD
		CONSTRAINT FK_BRAND_TO_BEER
		FOREIGN KEY (
			br_name
		)
		REFERENCES BRAND (
			br_name
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE REVIEW
	ADD
		CONSTRAINT FK_MEMBER_TO_REVIEW
		FOREIGN KEY (
			m_no
		)
		REFERENCES MEMBER (
			m_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE REVIEW
	ADD
		CONSTRAINT FK_BEER_TO_REVIEW
		FOREIGN KEY (
			b_no
		)
		REFERENCES BEER (
			b_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE QnA
	ADD
		CONSTRAINT FK_Storage_TO_QnA
		FOREIGN KEY (
			s_no
		)
		REFERENCES Storage (
			s_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE LIST
	ADD
		CONSTRAINT FK_BEER_TO_LIST
		FOREIGN KEY (
			b_no
		)
		REFERENCES BEER (
			b_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE LIST
	ADD
		CONSTRAINT FK_Storage_TO_LIST
		FOREIGN KEY (
			s_no
		)
		REFERENCES Storage (
			s_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE guestbook
	ADD
		CONSTRAINT FK_Storage_TO_guestbook
		FOREIGN KEY (
			s_no
		)
		REFERENCES Storage (
			s_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE guestbook
	ADD
		CONSTRAINT FK_MEMBER_TO_guestbook
		FOREIGN KEY (
			m_no
		)
		REFERENCES MEMBER (
			m_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;

ALTER TABLE Storage
	ADD
		CONSTRAINT FK_MEMBER_TO_Storage
		FOREIGN KEY (
			m_no
		)
		REFERENCES MEMBER (
			m_no
		)
		ON DELETE CASCADE
		NOT DEFERRABLE
		INITIALLY IMMEDIATE
		ENABLE
		VALIDATE;


ALTER TABLE BEER ADD UNIQUE(bname);

ALTER TABLE MEMBER ADD UNIQUE(id,email);

ALTER TABLE BEER ADD CONSTRAINT CK_type CHECK(TYPE IN ('ALE', 'PaleAle', 'IPA', 'Weizen', 'Porter', 'Stout', 'Larger','Pilsner','Dunkel','PaleLager','Dry'));



/* 트리거 목록 */
CREATE OR REPLACE TRIGGER TRG_brand
AFTER update of br_name ON brand FOR EACH ROW
BEGIN
    UPDATE beer
    SET  br_name =:NEW.br_name WHERE br_name =:OLD.br_name;
END;
/


CREATE OR REPLACE TRIGGER TRG_s_no
AFTER update of s_no ON storage FOR EACH ROW
BEGIN
    UPDATE QnA
    SET  s_no=:NEW.s_no WHERE s_no=:OLD.s_no;
    UPDATE guestbook
    SET  s_no=:NEW.s_no WHERE s_no=:OLD.s_no;
    UPDATE list
    SET  s_no=:NEW.s_no WHERE s_no=:OLD.s_no;
END;
/


create or replace trigger trg_m_no
after update of m_no
on member
for each row
begin
	update review set m_no = :new.m_no where m_no = :old.m_no;
	update storage set m_no = :new.m_no where m_no = :old.m_no;
	update guestbook set m_no = :new.m_no where m_no = :old.m_no;
end;
/

create or replace trigger trg_b_no
after update of b_no
on beer
for each row
begin
	update review set b_no = :new.b_no where b_no = :old.b_no;
	update list set b_no = :new.b_no where b_no = :old.b_no;
end;
/

create or replace trigger trg_member
after insert on member
for each row
begin
insert into storage(s_no, m_no) values('s'||:NEW.id, :NEW.m_no);
end;
/ 


/* 시퀀스 */

CREATE SEQUENCE SEQ_b_no
START WITH 1
INCREMENT BY 1
MAXVALUE 9999;

CREATE SEQUENCE SEQ_r_no
START WITH 1
INCREMENT BY 1
MAXVALUE 9999;

CREATE SEQUENCE SEQ_q_no
START WITH 1
INCREMENT BY 1
MAXVALUE 9999;

CREATE SEQUENCE SEQ_g_no
START WITH 1
INCREMENT BY 1
MAXVALUE 9999;
