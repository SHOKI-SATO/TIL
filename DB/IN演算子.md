# IN演算子

## ▼IN演算子とは
>・複数の値を指定して検索が可能（AとBとCのいずれかに該当するデータを抽出したい）<br>
>・一般的にWHERE句と一緒に使われる<br>
<br>

### ●基本構文
```sql
SELECT カラム名
FROM テーブル名
WHERE カラム名 IN (値1, 値2, 値3, ...);
```
```sql
-- 例
SELECT *
FROM users
WHERE address IN ('東京都', '大阪府', '神奈川県');
```
