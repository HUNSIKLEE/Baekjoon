-- 코드를 입력하세요
SELECT a.AUTHOR_ID,b.AUTHOR_NAME, a.CATEGORY,SUM(a.PRICE * c.SALES) TOTAL_SALES
FROM BOOK a
JOIN AUTHOR b on a.AUTHOR_ID = b.AUTHOR_ID
JOIN BOOK_SALES c on a.BOOK_ID = c.BOOK_ID
WHERE SALES_DATE like '2022-01%'
GROUP BY AUTHOR_ID, CATEGORY
ORDER BY AUTHOR_ID, CATEGORY desc

