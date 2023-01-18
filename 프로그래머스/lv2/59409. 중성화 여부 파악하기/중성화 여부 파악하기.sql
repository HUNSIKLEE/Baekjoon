-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, 
CASE SEX_UPON_INTAKE 
WHEN 'Neutered Male' then 'O' 
WHEN 'Spayed Female' then 'O' 
ELSE 'X' END 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID

