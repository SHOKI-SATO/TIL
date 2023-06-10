# 基本的なSQL構文

### ●DDL
```sql
-- テーブルの新規作成
CREATE TABLE テーブル名 (カラム名, データ型,　オプション, カラム名, データ型,　オプション);
--テーブの追加、変更
ALTER TABLE テーブル名 ADD カラム名, データ型,　オプション;
--テーブルの削除（復元不可）
DROP table テーブル名;
--データの削除（全レコードの削除、復元不可）
TRUNCATE table テーブル名;
```

### ●DML
```
--データの抽出
SELECT カラム名 FROM テーブル名 WHERE 条件;
--データの更新
UPDATE テーブル名 SET カラム名 = データ;
--データの追加
INSERT INTO テーブル名 (カラム名, カラム名) VALUES (データ,　データ);
--データの削除
DELETE FROM テーブル名;
```
<br>
