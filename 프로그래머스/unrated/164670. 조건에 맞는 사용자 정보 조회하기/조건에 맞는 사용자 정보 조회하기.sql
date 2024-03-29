-- 코드를 입력하세요
SELECT b.USER_ID, b.NICKNAME, 
CONCAT(b.CITY, ' ', b.STREET_ADDRESS1, ' ', b.STREET_ADDRESS2) 전체주소, 
CONCAT(LEFT(b.TLNO, 3), '-', MID(b.TLNO, 4, 4), '-', RIGHT(b.TLNO, 4)) 전화번호
FROM USED_GOODS_BOARD a
JOIN USED_GOODS_USER b on a.WRITER_ID = b.USER_ID
GROUP BY b.USER_ID
HAVING COUNT(*) >= 3
ORDER BY b.USER_ID desc