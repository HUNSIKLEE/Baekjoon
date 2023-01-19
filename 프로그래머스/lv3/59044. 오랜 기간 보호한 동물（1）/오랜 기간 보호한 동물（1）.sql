-- 코드를 입력하세요
SELECT a.NAME, a.DATETIME
FROM ANIMAL_INS a
LEFT JOIN ANIMAL_OUTS b on a.ANIMAL_ID = b.ANIMAL_ID
WHERE b.ANIMAL_ID IS NULL
ORDER BY a.DATETIME LIMIT 3
