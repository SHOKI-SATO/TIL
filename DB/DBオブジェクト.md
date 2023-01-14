# DBオブジェクト

## ▼DBオブジェクト一覧（Postgresql）

### ●Collations（コレーション）
>順序のロケール定義

### ●Domains（ドメイン）
>入力の細かい制約

### ●FTS Configurations
### ●FTS　Dictionaries
### ●FTS Parsers
### ●FTS Templetes
### ●Foreign Tables（外部テーブル）
>DBリンクの性能の良い版

### ●Functions（ファンクション）
>戻り値があるPGSQL（DB内で実行可能なプログラム、大量（10万件程）INSERT時の最終手段）

### ●Materialized Views（マテビュー）
>一定間隔の更新を要する物理ビュー（ビューアクセス時にSQLが実行されないため、ビューに対する検索速度が速い）

### ●Procedures（プロシージャ）
>戻り値のないPGSQL（DB内で実行可能なプログラム、大量（10万件程）INSERT時の最終手段）

### ●Sequences（シーケンス）
>順序オブジェクト　番号を自動的に裁判したい場合に利用する

### ●Tables（テーブル）
>複数レコードの集合体、表

### ●View（ビュー）
>一時的な表　一定のSELECT結果をまとめて１テーブルのように扱いたい場合に利用する

### ●Trigger Functions（トリガー）
>テーブルに対してINSERT（UPDATE）を契機に実行するファンクションを設定するもの

### ●Types（タイプ）
>値について一定の「範囲」や「リスト」などを持つ型を独自に規定出来る
