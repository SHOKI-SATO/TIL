-- 所持金で、お金持ちか分類する
SELECT userID, gold,
 CASE 
    WHEN gold >= 3000 THEN ('大金持ち')
    WHEN gold >= 1000 THEN ('小金持ち')
    ELSE '大金持ち'
 END AS finance
FROM users;
