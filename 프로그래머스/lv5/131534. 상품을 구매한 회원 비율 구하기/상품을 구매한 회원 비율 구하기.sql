-- 코드를 입력하세요
SELECT YEAR(b.SALES_DATE) YEAR, 
        MONTH(b.SALES_DATE) MONTH, 
        COUNT(DISTINCT b.USER_ID) PUCHASED_USERS, 
        ROUND(COUNT(DISTINCT b.USER_ID) / (SELECT COUNT(*) FROM USER_INFO WHERE EXTRACT(YEAR FROM JOINED) = 2021),1) PUCHASED_RATIO
FROM USER_INFO a
JOIN ONLINE_SALE b ON a.USER_ID = b.USER_ID
WHERE a.JOINED LIKE '%2021%' 
GROUP BY YEAR,MONTH
ORDER BY YEAR,MONTH