SELECT yearMonth, COUNT(user)
FROM 
-- 月次アクティブユーザー数を求める
(SELECT DISTINCT
	DATE_FORMAT(startTime, '%Y-%m') AS yearMonth,
	eventlog.userID AS user
FROM eventlog
	INNER JOIN users ON users.userID = eventlog.userID
WHERE deleted_at IS NULL) AS ACTIVE
GROUP BY yearMonth;


--注意点：サブクエリには、必ず別名（ASの指定）が必要
