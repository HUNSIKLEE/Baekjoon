-- 코드를 입력하세요
SELECT b.ANIMAL_ID, b.ANIMAL_TYPE, b.NAME
FROM ANIMAL_INS a
JOIN ANIMAL_OUTS b on a.ANIMAL_ID = b.ANIMAL_ID
WHERE a.SEX_UPON_INTAKE like '%Intact%' and 
      b.SEX_UPON_OUTCOME in ('Spayed Female', 'Neutered Male')
ORDER BY ANIMAL_ID