# CONCAT関数

## ▼文字列の結合
#### ●CONCAT
```sql
  SELECT CONCAT(lastname, firstname) FROM claass;
```
<br>

### ※DBサーバにより制限等が異なるため、注意

#### ▽OracleDBの場合
>引数を２つしか指定することが出来ない<br>
>そのため、CONCAT関数で複数の文字列を結合するには、入れ子にする必要がある<br>
```sql
SELECT CONCAT(CONCAT(last_name, '''s job category is '), job_id) "Job" 
  FROM employees 
  WHERE employee_id = 152;

--結果
Job
------------------------------------------------------
Hall's job category is SA_REP
```
<br>

>ただし、Oracleには文字列結合子「||」があるので、２つ以上の値の結合はこちらのほうが使い勝手がよく、コードも見やすい<br>
```sql
INSERT INTO tab1 (col1,  col2,     col3,     col4)
          VALUES ('abc', 'def   ', 'ghi   ', 'jkl');

SELECT col1 || col2 || col3 || col4 "Concatenation"
  FROM tab1;

Concatenation
------------------------
abcdef   ghi   jkl
```
<br>

#### ▽SQLServerの場合
>CONCATの引数は2個以上254個未満の指定が可能<br>
>>数値は暗黙的に文字列に変換される<br>
```sql
SELECT CONCAT ( 'Happy ', 'Birthday ', 11, '/', '25' ) AS Result;  

Result  
-------------------------  
Happy Birthday 11/25  
  
(1 row(s) affected)  
```
<br>

>NULL値を空の文字列に暗黙的に変換される<br>
>連結対象の文字列の一つにNULLが含まれていた場合、NULLは無視される<br>
```sql
CREATE TABLE #temp (  
    emp_name NVARCHAR(200) NOT NULL,  
    emp_middlename NVARCHAR(200) NULL,  
    emp_lastname NVARCHAR(200) NOT NULL  
);  
INSERT INTO #temp VALUES( 'Name', NULL, 'Lastname' );  
SELECT CONCAT( emp_name, emp_middlename, emp_lastname ) AS Result  
FROM #temp;  

Result  
------------------  
NameLastname  
  
(1 row(s) affected)  
```
<br>

>区切り文字指定が可能な文字列連結関数CONCAT_WSが用意されている<br>
```sql
--区切り文字として、'-'を指定
SELECT CONCAT_WS( ' - ', database_id, recovery_model_desc, containment_desc) AS DatabaseInfo
FROM sys.databases;

------------------
1 - SIMPLE - NONE
2 - SIMPLE - NONE
3 - FULL - NONE
4 - SIMPLE - NONE
```
<br>

#### ▽MySQLの場合
>連結対象の文字列に一つでもNULLが含まれていた場合、CONCATの返り値はNULLになる<br>
>>数値は暗黙的に文字列に変換される<br>
```sql
mysql> SELECT CONCAT('My', 'S', 'QL');
        -> 'MySQL'
mysql> SELECT CONCAT('My', NULL, 'QL');
        -> NULL
mysql> SELECT CONCAT(14.3);
        -> '14.3'
```
<br>

>また、MySQLでは、文字列を空白で区切って記述すると連結する機能がある<br>
```sql
mysql> SELECT 'My' 'S' 'QL';
        -> 'MySQL'
```
<br>

>CONCAT_WSは、区切り文字を指定して文字列の連結を行う<br>
```sql
CONCAT_WS(separator,str1,str2,...)
```
<br>

>連結対象の文字列にNULLが含まれていた場合、処理がスキップされる<br>
>ただし、区切り文字（第一引数のseparator）がNULLの場合、結果はNULLになる<br>
```sql
mysql> SELECT CONCAT_WS(',','First name','Second name','Last Name');
        -> 'First name,Second name,Last Name'
mysql> SELECT CONCAT_WS(',','First name',NULL,'Last Name');
        -> 'First name,Last Name'
```
<br>

#### ▽PostgreSQLの場合
>連結対象の文字列にNULLが含まれていた場合は無視します。<br>
```sql
select concat('abcde', 2, NULL, 22);

--------
abcde222
```
<br>

>区切り文字を指定して文字列を結合する関数concat_wsの構文は以下<br>
```sql
concat_ws(sep text, str "any" [, str "any" [, ...] ])
```
<br>

>NULLは無視される<br>
```sql
concat_ws(',', 'abcde', 2, NULL, 22)	

----------
abcde,2,22
```
<br>

