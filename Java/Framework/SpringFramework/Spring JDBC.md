# Spring JDBC

## ▼Spring JDBCとは
>・Spring Frameworkに標準で用意されているライブラリの一つ<br>
>・JDBCの標準仕様に準拠していることに加え、アプリケーションのプログラムからより簡単にJDBCを利用するための便利なクラス、インターフェースが提供されている<br>
<br>

### ●事前準備
>・`pom.xml`に依存関係の追加<br>
>・以下を`<dependencies>`に追加する<br>
```xml
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
```
>※変更後はMavenモジュールの再ロードを忘れずに
<br>
