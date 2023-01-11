-- 코드를 입력하세요
SELECT YEAR(a.SALES_DATE) YEAR,MONTH(a.SALES_DATE) MONTH, GENDER , COUNT(distinct b.USER_ID) USERS
FROM ONLINE_SALE a
JOIN USER_INFO b on a.USER_ID = b.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR,MONTH,GENDER
ORDER BY YEAR,MONTH,GENDER;