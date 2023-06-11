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
-- name がsato以外
SELECT * FROM tables WHERE name <> 'sato';

-- memo がNULL
SELECT * FROM tables WHERE memo IS NULL;
-- memo がNULL以外
SELECT * FROM tables WHERE memo IS NOT NULL;

-- height が160と170の間
SELECT * FROM tables WHERE height between 160 AND 170;



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

