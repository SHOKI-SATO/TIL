# JDBC

## ▼JDBCとは
>・Java DataBase Connecitvity<br>
>・JavaプログラムからRDBMSにアクセスする際に必要となるAPI<br>
>・Javaの基本機能として用意されているAPIであり、関連するクラスやインターフェースは`java.sqlパッケージ`　に実装されている<br>
<br>

### ●特徴
>・特定のRDBMSに依存しない<br>
>>接続対象のRDBMSが変更されても、Javaのコードを変えずにそのまま利用できる<br>
>・RDBMS側には`JDBCドライバ`という専用ライブラリが必要になる　<br>
>>現在利用されているほとんどのRDBMSではJDBCドライバが提供されているため、利用時に困ることはほぼない<br>
<br>
