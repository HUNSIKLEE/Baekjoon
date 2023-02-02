SELECT r.food_type, r.rest_id, r.rest_name, r.favorites
FROM REST_INFO r, (SELECT food_type, MAX(favorites) maxv FROM REST_INFO GROUP BY food_type) tmp
WHERE r.food_type = tmp.food_type 
  AND r.favorites = tmp.maxv
ORDER BY 1 DESC;