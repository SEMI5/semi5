
-- 호관 -- 
--안해도됨  --  N_BOARD 테이블 제약조건 변경 (외래키 연쇄삭제) --  
ALTER TABLE N_ATTACH DROP CONSTRAINT SYS_C007488;
ALTER TABLE N_ATTACH ADD CONSTRAINT SYS_C007488 FOREIGN KEY(BID) 
REFERENCES N_BOARD(BID) ON DELETE CASCADE;  


--필수!!!! 테이블 공지사항에 칼럼 추가 (보드 레벨) -- 
ALTER TABLE N_BOARD ADD BLEVEL NUMBER DEFAULT 1;

UPDATE N_BOARD 
SET BLEVEL = 4
WHERE BID BETWEEN 7 AND 14;


-- 준배
ALTER TABLE S_FILE MODIFY BTYPE DEFAULT 3;