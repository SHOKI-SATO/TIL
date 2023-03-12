# H2 Databese Engine

## ▼H2 Database Engineとは
>・オープンソースで開発されているRDBMS<br>
<br>

### ●特徴
>・プログラム本体のサイズが小さく、軽量に動作する<br>
>・単一のJarファイルｇで構成されており、OSへのインストールが不要<br>
>>大量のデータを扱う様な大規模なアプリケーションでの利用には不向きだが、簡単なWebアプリケーションでの利用におすすめ<br>
<br>
>・データベース本体を単一のファイルに保存するモード、ファイルには保存せず、メモリ上にのみ記録するモードの２つのモードがある<br>
<br>

### ●利用方法
#### ○Spring Bootアプリケーションの場合
>①単独でダウンロードしての利用も可能だが、Mavenリポジトリでも公開されているため`pom.xml`の<`dependencies>`依存関係の設定に以下を追加する<br>
```xml
<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
</dependency>
```
<br>

>JDBCとしてSpring JDBCを利用する場合は以下も追記
```xml
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
```
<br>

>②`application.propaties`に以下の様に設定を記述<br>
```shell
# JDBCドライバのクラス名
spring.datasource.driver-class-name = org.h2.Driver
# データベースのパス　（「jdbc:h2:」+ファイルのパス）
spring.datasource.url = jdbc:h2:~/taskdb
# データベース接続のユーザ名
spring.datasource.username = gihyo
# データベース接続パスワード
spring.datasource.password = gihyodb
# SQLファイルを利用したデータベース初期化を行うかどうか（always:常に行う、embedded（組み込みDBのときのみ行う、never：行わない））
spring.datasource.initialization = mode = always
# H2コンソールを有効にするかどうか(true、false)
spring.h2.console.enabled=true
```
<br>

>③プロジェクトを起動した状態で実行しているローカルホストURLの末尾に`/h2-console/`を追記してアクセス<br>
>>`http://localhost:8080/h2-console/login.do?jsessionid=9ad4c1e5a5fb6bff743b8e5c67421fea`<br>
<img width="465" alt="スクリーンショット 2023-03-12 16 37 08" src="https://user-images.githubusercontent.com/81621944/224531025-874b6763-7bbd-47ae-ac37-a12ed24c4d32.png"><br>
<br>

>④必要事項を入力し（入力内容は②で`apprlication.propaties`に設定した内容）、接続を押下し、接続完了<br>
<img width="1604" alt="スクリーンショット 2023-03-12 16 41 11" src="https://user-images.githubusercontent.com/81621944/224531146-2c30279b-665e-47ab-8568-6a9b7bf2c09f.png"><br>
<br>






