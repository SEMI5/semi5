----------KH GROUPWARE------------------------
 
----- VIEW  --------

--------------------------------------호관-------------------------
CREATE OR REPLACE VIEW N_BLIST 
AS 
SELECT ROWNUM RNUM, BID, CID, BTITLE, BCONTENT, BTYPE, USER_NO, USER_NAME, BCOUNT, CREATE_DATE, MODIFY_DATE, STATUS, BLEVEL
FROM (SELECT B.BID, B.CID, B.BTITLE,B. BCONTENT,B.BTYPE, M.USER_NO, M.USER_NAME, B.BCOUNT, B.CREATE_DATE, B.MODIFY_DATE, B.STATUS, B.BLEVEL
      FROM N_BOARD B
      JOIN MEMBER M ON(B.BWRITER = M.USER_NO)
      WHERE B.STATUS = 'Y'
      ORDER BY BLEVEL DESC, BID DESC);

CREATE OR REPLACE VIEW N_BDETAIL
AS 
SELECT B.BID, B.CID, B.BTITLE,B. BCONTENT,B.BTYPE, M.USER_NO, M.USER_NAME, B.BCOUNT, B.CREATE_DATE, B.MODIFY_DATE, B.STATUS, B.BLEVEL
      FROM N_BOARD B
      JOIN MEMBER M ON(B.BWRITER = M.USER_NO)
      WHERE B.STATUS = 'Y';

CREATE OR REPLACE VIEW N_ADETAIL 
AS 
SELECT B.RNUM, A.FID, A.BID, B.CID, B.BTITLE, B.USER_NAME, B.BCONTENT, B.BTYPE, ORIGIN_NAME, CHANGE_NAME, FILE_PATH, UPLOAD_DATE, FILE_LEVEL, DOWNLOAD_COUNT, A.STATUS, B.BLEVEL 
FROM N_ATTACH A
JOIN N_blist B ON(B.BID = A.BID)
WHERE B.STATUS = 'Y';   


CREATE OR REPLACE VIEW F_BLIST 
AS 
SELECT ROWNUM RNUM, BID, CID, BTITLE, BCONTENT, BTYPE, USER_NO, USER_NAME, BCOUNT, CREATE_DATE, MODIFY_DATE, STATUS, BLEVEL
FROM (SELECT B.BID, B.CID, B.BTITLE,B. BCONTENT,B.BTYPE, M.USER_NO, M.USER_NAME, B.BCOUNT, B.CREATE_DATE, B.MODIFY_DATE, B.STATUS, B.BLEVEL
      FROM F_BOARD B
      JOIN MEMBER M ON(B.BWRITER = M.USER_NO)
      WHERE B.STATUS = 'Y'
      ORDER BY BLEVEL DESC, BID DESC);

CREATE OR REPLACE VIEW F_BDETAIL
AS 
SELECT B.BID, B.CID, B.BTITLE,B. BCONTENT,B.BTYPE, M.USER_NO, M.USER_NAME, B.BCOUNT, B.CREATE_DATE, B.MODIFY_DATE, B.STATUS, B.BLEVEL
      FROM F_BOARD B
      JOIN MEMBER M ON(B.BWRITER = M.USER_NO)
      WHERE B.STATUS = 'Y';

CREATE OR REPLACE VIEW F_ADETAIL 
AS 
SELECT B.RNUM, A.FID, A.BID, B.CID, B.BTITLE, B.USER_NO, B.USER_NAME, B.BCONTENT, B.BTYPE, ORIGIN_NAME, CHANGE_NAME, FILE_PATH, UPLOAD_DATE, FILE_LEVEL, DOWNLOAD_COUNT, A.STATUS, B.BLEVEL 
FROM F_ATTACH A
JOIN F_BLIST B ON(B.BID = A.BID)
WHERE B.STATUS = 'Y';   



CREATE OR REPLACE VIEW F_RLIST
AS
SELECT RID, RCONTENT, REF_BID, USER_NAME, R.CREATE_DATE, R.MODIFY_DATE, R.STATUS
FROM F_REPLY R
JOIN MEMBER M ON(R.RWRITER=M.USER_NO)
WHERE R.STATUS='Y'
ORDER BY RID DESC;






--------------------------------------준배-------------------------

CREATE SEQUENCE SEQ_SBNO;
-자료실 시퀀스


--사진게시판 리스트 뷰
CREATE OR REPLACE VIEW T_BLIST 
AS 
SELECT ROWNUM RNUM, BID, CID, BTITLE, BTYPE, BCONTENT, BCOUNT, USER_NAME, CREATE_DATE, MODIFY_DATE, STATUS
FROM (SELECT T.BID, T.CID, T.BTITLE, T.BTYPE, T.BCONTENT, T.BCOUNT, M.USER_NAME, T.CREATE_DATE, T.MODIFY_DATE, T.STATUS		      
      FROM T_BOARD T
      JOIN MEMBER M ON(T.BWRITER = M.USER_NO)
      WHERE T.STATUS = 'Y'
      ORDER BY BID DESC);


--사진게시판 디테일 뷰
CREATE OR REPLACE VIEW T_BDETAIL 
AS 
SELECT T.BID, T.CID, T.BTITLE,  T.BTYPE, T.BCONTENT,  T.BCOUNT, M.USER_NAME, T.CREATE_DATE, T.MODIFY_DATE, T.STATUS
      FROM T_BOARD T
      JOIN MEMBER M ON(T.BWRITER = M.USER_NO)
      WHERE T.STATUS = 'Y';    


-- 공유자료 리스트 뷰
CREATE OR REPLACE VIEW S_FLIST 
AS 
SELECT ROWNUM RNUM, BID, CID, BTITLE, BTYPE, BCONTENT, BCOUNT, USER_NAME, CREATE_DATE, MODIFY_DATE, STATUS
FROM (SELECT S.BID, S.CID, S.BTITLE, S.BTYPE, S.BCONTENT, S.BCOUNT, M.USER_NAME, S.CREATE_DATE, S.MODIFY_DATE, S.STATUS		      
      FROM S_FILE S
      JOIN MEMBER M ON(S.BWRITER = M.USER_NO)
      WHERE S.STATUS = 'Y'
      ORDER BY BID DESC);
      

-- 공유자료 디테일 뷰
CREATE OR REPLACE VIEW S_FDETAIL 
AS 
SELECT S.BID, S.CID, S.BTITLE,  S.BTYPE, S.BCONTENT, S.BCOUNT, M.USER_NAME, S.CREATE_DATE, S.MODIFY_DATE, S.STATUS
      FROM S_FILE S
      JOIN MEMBER M ON(S.BWRITER = M.USER_NO)
      WHERE S.STATUS = 'Y';
      