# SELECT文

## ▼基本型
#### ●SELECT文
```sql
--全レコード抽出
SELECT * FROM tables;

--指定カラム抽出
SELECT user, name FROM tables;
```
<br>

## ▼条件指定
#### ●ORDER BY句
>・指定した順に並べ替え
```sql
--昇順に並べ替え
SELECT * FROM tables ORDER BY user_id ASC;
SELECT * FROM tables ORDER BY user_id;

--昇順に並べ替え
SELECT * FROM tables ORDER BY user_id DESC;
```

#### ●LIMIT句
>・指定行数のみ抽出
```sql
--10行のみ抽出
SELECT * FROM tables LIMIT 10;
```

#### ●WHERE句
>・指定レコードを抽出
```sql
-- user_id が10以上
SELECT * FROM tables WHERE user_id >= 10;

-- name がsato
SELECT * FROM tables WHERE name = 'sato';
-- name がsatoとsuzukiとyamada
SELECT * FROM tables WHERE name = 'sato' OR name = 'suzuki' OR name = 'yamada';
SELECT * FROM tables WHERE name IN('sato', 'suzuki', 'yamada');

-- name がsato以外
SELECT * FROM tables WHERE name != 'sato';
SELECT * FROM tables WHERE name <> 'sato';
-- name がsatoとsuzukiとyamada以外
SELECT * FROM tables WHERE name NOT IN('sato', 'suzuki', 'yamada');

-- name がsatoと sex がmale以外
SELECT * FROM tebles WHERE NOT(name = 'sato' OR sex = male);

-- memo がNULL
SELECT * FROM tables WHERE memo IS NULL;
-- memo がNULL以外
SELECT * FROM tables WHERE memo IS NOT NULL;

-- height が160と170の間
SELECT * FROM tables WHERE height BETWEEN 160 AND 170;
SELECT * FROM tables WHERE height >= 160 AND height <= 170;
-- height が160と170の間以外
SELECT * FROM tables WHERE height NOT(BETWEEN 160 AND 170);

-- title にGoldを含む
SELECT * FROM tables WHERE title LIKE '%Gold%';
```

#### ●結合
>・複数のテーブルを１つのテーブルに結合（内部結合、（左・右・完全）外部結合）
```sql
-- 内部結合
--bookテーブルにpublisher_idをキーにしてpublisherテーブルを結合
SELECT * FROM book INNER JOIN publisher ON book.publisher_id = publisher.publisher_id;
--　※結合先テーブルにデータが存在しない、またはNULLのレコードは表示しない


-- 外部結合
--左外部結合（左の（FROM句で指定した）テーブルを元に、結合先のテーブルにデータが存在する場合に結合）・・・左のテーブルデータを全て取得する
SELECT * FROM book LEFT OUTER JOIN publisher ON book.publisher_id = publisher.publisher_id;

--右外部結合（FROM句で指定したテーブルを、右の（結合先）テーブルを元にデータが存在するものだけ結合）・・・右のテーブルデータを全て取得する
SELECT * FROM book RIGHT OUTER JOIN publisher ON book.publisher_id = publisher.publisher_id;
--　※結合先テーブルにデータが存在しない、またはNULLのレコードも表示する

-- ３つ以上のテーブル結合
SELECT * FROM book INNER JOIN sales ON book.book_id = sales.book_id LEFT OUTER JOIN category ON book.category_id = category.category_id;
```

#### ●GROUP BY句
>・レコードをグループ化する
```sql
--job_idでグループ化したレコードを表示
SELECT job_id, COUNT(*)　FROM employees　GROUP BY job_id;
--※GROUP BYを使用する場合、SELECTで指定できるのは「集約キー（GROUP BYで指定したカラム）」「集約関数（MAXなど）」「件数」のみ
--  集約キーには、ASで指定した別名は指定できない

```

#### ●句
>・
```sql
--

```

#### ●句
>・
```sql
--

```

#### ●句
>・
```sql
--

```

