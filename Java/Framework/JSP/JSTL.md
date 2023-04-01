# JSTL

## ▼JSTL（JSP Standard Tag Library）とは
>・JSP内でよく使われる機能をタグライブラリとしてまとめたもの（のうちのひとつ）<br>
>・ELと組合せることでスクリプトレットが不要になり、可読性・保守性が向上する<br>
>・カスタムタグといい、自分でタグを作ることも可能
<br>

### ●JSTLに含まれているタグライブラリ
>・JSTLでは、提供される昨日により５つのタグライブラリに分類される<br>

|  タグライブラリ  |  prefix  | 概要 |
| ---- | ---- | ---- |
|  Core  |  c<br>http://java.sun.com/jsp/jstl/core  | 変数操作、条件分岐、制御構文、URL管理などの基本多気な機能を提供 |
|  i18n（国際化）  |  fmt<br>http://java.sun.com/jsp/jstl/fmt  | メッセージの形式処理、通貨などに関するロケール処理、数値や日付の形式処理の機能を提供 |
|  Functions  |  fn<br>http://java.sun.com/jsp/jstl/functions  | コレクション（List、Map、配列など）の処理や文字列操作に関する機能を提供 |
|  XML  |  x<br>http://java.sun.com/jsp/jstl/xml  | XML文章の解析やXML変換の機能を提供 |
|  Database  |  sql<br>http://java.sun.com/jsp/jstl/sql  | データベースへの接続、検索、更新、トランザクション制御などの機能を提供 |
<br>

### ●事前準備
>・JSTLのタグライブラリはJarファイル形式で提供されており、JSPの動作環境にそのまま追加して使用することが可能（※Eclipseの動的Webプロジェクトでの構成が前提）<br>

>①Jarファイルの入手<br>
>>以下のサイトからJarファイルをDL<ｂr>
>>https://tomcat.apache.org/download-taglibs.cgi<br>
<img width="821" alt="スクリーンショット 2023-04-01 11 09 26" src="https://user-images.githubusercontent.com/81621944/229260900-970e50fc-219f-4fec-8f6e-1bafbb841790.png"><br>
<br>

>②Jarファイルを配置<br>
>>`WEB-INF/lib`直下に配置<br>
<img width="350" alt="スクリーンショット 2023-04-01 11 10 52" src="https://user-images.githubusercontent.com/81621944/229260966-31a61e12-6411-471c-8953-39cb3cf8f6d3.png"><br>
<br>

>③JSP内で使用するタグライブラリを宣言<br>
```jsp
<%@ taglib prefix="prefix名" uri="TLDファイルのURI" %>

//Coreライブラリを利用する場合
prefix="c" uri="http://java.sun.com/jsp/jstl/core"
```

#### ●Coreタグライブラリ
>・Coreライブラリで主に利用されるタグ一覧<br>
<img width="854" alt="スクリーンショット 2023-04-01 11 13 59" src="https://user-images.githubusercontent.com/81621944/229261099-ff6d8a89-dd6c-4ee8-98d2-d8a59dfe507a.png"><br>
<br>

<img width="687" alt="スクリーンショット 2023-04-01 11 16 31" src="https://user-images.githubusercontent.com/81621944/229261185-6cf69140-964b-49ca-8a71-8cb146356d8b.png"><br>
<br>




