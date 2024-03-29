SELECT  
    #   A.BOARD_ID
    # , A.VIEWS
    # , B.*
     CONCAT('/home/grep/src/',A.BOARD_ID,'/',B.FILE_ID,B.FILE_NAME,B.FILE_EXT) AS FILE_PATH
FROM(SELECT *
    FROM USED_GOODS_BOARD
    ORDER BY VIEWS DESC
    LIMIT 1) A
LEFT JOIN USED_GOODS_FILE B ON A.BOARD_ID = B.BOARD_ID
ORDER BY B.FILE_ID DESC