# サブクエリ

## ▼CASE式とは
>・SQLに使用可能な条件式<br>
<br>

## ▼基本型
#### ●CASE式
```sql
-- 基本構文
CASE
WHEN 条件A THEN 処理A
WHEN 条件B THEN 処理B
ELSE 処理C
END

-- 例
SELECT
  name,point,
  CASE
      WHEN 90 <= point THEN "合格(ラクラク)"
      WHEN 80 <= point THEN "合格(ギリギリ)"
      ELSE "不合格"
  END
FROM user;
```
