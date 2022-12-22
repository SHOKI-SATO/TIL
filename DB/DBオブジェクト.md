# DBオブジェクト

### ▼DBオブジェクト一覧（Postgresql）

#### ●Collations（コレーション）
&ensp;・順序のロケール定義<br>
#### ●Domains（ドメイン）
&ensp;・入力の細かい制約<br>
#### ●FTS Configurations
#### ●FTS　Dictionaries
#### ●FTS Parsers
#### ●FTS Templetes
#### ●Foreign Tables（外部テーブル）
&ensp;・DBリンクの性能の良い版<br>
#### ●Functions（ファンクション）
&ensp;・戻り値があるPGSQL（DB内で実行可能なプログラム、大量（10万件程）INSERT時の最終手段）<br>
#### ●Materialized Views（マテビュー）
&ensp;・一定間隔の更新を要する物理ビュー（ビューアクセス時にSQLが実行されないため、ビューに対する検索速度が速い）<br>
#### ●Procedures（プロシージャ）
&ensp;・戻り値のないPGSQL（DB内で実行可能なプログラム、大量（10万件程）INSERT時の最終手段）<br>
#### ●Sequences（シーケンス）
&ensp;・順序オブジェクト　番号を自動的に裁判したい場合に利用する<br>
#### ●Tables（テーブル）
&ensp;・複数レコードの集合体、表<br>
#### ●View（ビュー）
&ensp;・一時的な表　一定のSELECT結果をまとめて１テーブルのように扱いたい場合に利用する<br>
#### ●Trigger Functions（トリガー）
&ensp;・テーブルに対してINSERT（UPDATE）を契機に実行するファンクションを設定するもの<br>
#### ●Types（タイプ）
&ensp;・値について一定の「範囲」や「リスト」などを持つ型を独自に規定出来る<br>
