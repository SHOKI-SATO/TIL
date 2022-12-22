# SQL禁忌

#### ●COUNT(*)の利用
```SQL
--×
SELECT COUNT(*) FROM ITEM
--○
SELECT COUNT(NO) FROM ITEM
```
&ensp;行数（レコード件数）を取得するだけの場合は１項目だけで十分<br>
<br>

#### ●WHERE句で広い順に指定
```SQL
--×
SELECT 名前,タイトル,性別 
FROM ITEM
WHERE 性別 = '男' and
　　　　　　　　　　　　タイトル = 'マリオ'
--○
SELECT 名前,タイトル,性別 
FROM ITEM
WHERE タイトル = 'マリオ' and
　　　　　　　　　　　　性別 = '男'
```
&ensp;範囲が少なくなるものをWHERE句の先に指定（昨今のDB製品では自動でそのように処理するため、恐らく問題ない）
<br>

#### ●INの利用
```SQL
--×
SELECT 名前,タイトル,性別 
FROM ITEM
WHERE 性別コード　IN
（SELECT　性別コード　
 FROM 性別マスタ
　　WHERE　性別 = '男')
--○
SELECT 名前,タイトル,性別 
FROM ITEM
INNNER JOIN
（SELECT　性別コード　
 FROM 性別マスタ
　　WHERE　性別 = '男')
 TEMPITEM.性別コード = TEMP.性別コード
```
&ensp;「IN」を使うなら「INNNER JOIN」か「EXISTS」を使う<br>
&ensp;件数が少ない場合は同じ実行計画となるが、ある件数（数百万）を境に実行計画が変わる可能性が高い<br>
<br>

#### ●NOT INの利用
```SQL
--×
SELECT 名前,タイトル,性別 
FROM ITEM
WHERE 性別コード　NOT IN
（SELECT　性別コード　
 FROM 性別マスタ
　　WHERE　性別 = '男')
--○
SELECT 名前,タイトル,性別 
FROM ITEM
WHERE NOT EXISTS
（SELECT　性別コード　
 FROM 性別マスタ
　　WHERE　ITEM.性別コード = 性別マスタ.性別コード
 性別 = '男')
```
&ensp;「NOT IN　＝　〜以外」なので「INNER JOIN」は使えない<br>
&ensp;「NOT IN」は件数によって極端に重くなる代表的な構文のため、「NOT EXISTS」への転換を検討（結合を忘れず）<br>
<br>

#### ●絞り込み前に結合
```SQL
--×
SELECT タイトル
COUNT (NO)
FROM 
(SELECT * 
 FROM ITEM
 LEFT JOIN タイトルマスタ on
 ITEM.タイトル = タイトルマスタ.タイトル)
TEMP
GROUP BY タイトル
--○
SELECT タイトル,　TEWMP.件数
FROM 
(SELECT タイトル, COUNT(NO), AS　件数
 FROM ITEM
 GROUP BY　タイトル)
TEMP
LEFT JOIN タイトルマスタ on
TEMP.タイトル = タイトルマスタ.タイトル
```
&ensp;結合は基本的に負荷のかかる処理なので、結合前を件数を絞り込む<br>
<br>

#### ●小→大の結合
```SQL
--×
SELECT * 
FROM 性別マスタ
LEFT JOIN ITEM on
性別マスタ.性別コード = ITEM.性別コード
--○
SELECT * 
FROM ITEM
LEFT JOIN 性別マスタ on
ITEM.性別コード = 性別マスタ.性別コード
```
&ensp;「絞り込み後テーブル > 結合先テーブル」の状態は常に意識<br>
&ensp;「絞り込み後テーブル < 結合先テーブル」 の場合は結合先も絞り込む<br>
<br>

#### ●INDEXのない項目と結合
```SQL
--×
SELECT タイトル,　TEMP.件数,
FROM
(SELECT タイトルコード.COUNT(NO)
 FROM ITEM
 GROUP BY タイトルコード)
TEMP
LEFT JOIN タイトルマスタ ON
TEMP.タイトルコード　= タイトルマスタ.タイトルコード
```
&ensp;原則的に、結合キーになりうる項目にはINDEXを貼る（PKはプライマリーインデックスが自動付与されるため、問題ない）<br>
<br>

#### ●比較演算子で関数を利用
```SQL
--×
SELECT *
FROM ITEM
(SELECT 名前,　体重 * 1000 AS 体重2
 FROM ITEM)
TEMP
WHERE TEMP.体重２ > 5000
--×
SELECT *
FROM ITEM
WHERE SUBSTRING(名前 FROM 1 FOR 1) = 'マ'
--○
SELECT *
FROM TEMP
WHERE 体重　* 1000 > 5000
--○
SELECT *
FROM TEMP
(SELECT SUBSTRING (名前 FROM 1 FOR 1) AS 名前2,　体重
 FROM ITEM) TEMP
WHERE TEMP.体重2 > 5000
```
&ensp;インデックスが効かなくなる<br>
&ensp;「WHERE句における左辺」は加工しない<br>
<br>

#### ●後方一致のあいまい検索
```SQL
--×
SELECT *
FROM ITEM
WHERE 名前 LIKE　'%サムス'
--○
SELECT *
FROM ITEM
WHERE 名前 LIKE　'サムス%'
--○
SELECT *
FROM ITEM
WHERE 名前 LIKE　'ダーク%'
```
&ensp;後方一致の場合、インデックスが無効になる<br>
&ensp;SQL上どうしようもないため、画面入力の仕様から注意<br>
&ensp;「あいまい検索」をしたい画面だとしても、パフォーマンスの観点で「前方一致のみ」と規定するべき<br>
<br>

#### ●UNION
```SQL
--×
SELECT *
FROM ITEM
UNION
(SELECT *
 FROM ITEM2)
--○
SELECT *
FROM ITEMVIEW
 --※マテビューの定義
 　　SELECT * 
  FROM ITEM
  UNION
  (SELECT *
   FROM ITEM2)
```
&ensp;UNIONは性能劣化が激しい代表的な構文<br>
&ensp;どうしてもUNIONを利用する場合、UNION済みのマテビューを作る<br>
<br>
