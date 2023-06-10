# DELETE、TRUNCART、DROPの違い

## ▼DELETE、TRUNCART、DROPの違い
>・テーブルやデータの削除に関する３つのSQLの違いを理解する<br>
<br>

### ●DELETE
```sql
DELETE FROM テーブル名;
```
>・テーブルの指定したデータを削除する（WHEREで条件指定）<br>
>・ROLLBACK可能（COMMIT前）<br>
<br>


### ●TRUNCATE
```sql
TRUNCATE TABLE テーブル名;
```
>・テーブルの全データを削除する<br>
>・ROLLBACK不可<br>
>・WHERE句による条件指定が不可<br>
>・テーブルごと削除→再作成をするため、DELETEよりも処理が高速<br>
<br>

### ●DROP
```sql
DROP TABLE テーブル名;
```
>・テーブルを削除する<br>
>・ROLLBACK不可<br>
>・完全削除のため、表構造も残らない<br>
<br>


