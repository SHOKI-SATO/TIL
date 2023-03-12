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
>・単独でダウンロードしての利用も可能だが、Mavenリポジトリでも公開されているため`pom.xml`の<`dependencies>`依存関係の設定に以下を追加するのみ<br>
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


