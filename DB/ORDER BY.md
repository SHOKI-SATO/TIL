# ORDER BY

## ▼ORDER BYとは
>・データの並び順を指定する際に記述<br>
<br>

### ●「ASC、DESC、省略」の関係
```sql
--データを昇順に並べ替え（ASC）
SELECT * FROM users ORDER BY user_id ASC;
--→省略しも可能
SELECT * FROM users ORDER BY user_id ASC;

--データを降順に並べ替え（DESC）
SELECT * FROM users ORDER BY user_id DESC;
```
<br>

### ●複数指定する場合
```sql
SELECT * FROM users ORDER BY user_id ASC, name;
SELECT * FROM users ORDER BY user_id, name;
--　→user_id　と name　が昇順に表示される

--以下の場合、注意が必要
SELECT * FROM users ORDER BY user_id DESC, name;
--　→２つ目に指定したnameは省略しているためASCになると思いがちだが、直前のDESCに影響され、どちらもDESC（降順）となる
-- そのため、user_idを降順、nameを昇順にしたい場合は以下のように記述する
SELECT * FROM users ORDER BY user_id DESC, name ASC;
```
>※`１つ目のキーの場合は省略すれば昇順`、`2つ目のキーで省略すれば前のキーの影響を受ける`<br>
