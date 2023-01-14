# Java関連用語

## ▼Java関連用語
### ●Java
>・プログラミング言語である`Java言語`と実行環境であ`JVM（Java仮想マシン）`を中心としたプログラミング技術<br>
>・Sun Microsystems社によって開発が始められ、１９９６年にリリースされた<br>
>・その後2010年にOracle社がSun Microsystems社を買収し、Oracle社を中心にJavaの開発が進めれている<br>
>・毎年３月と９月に新しいバージョンがリリースされる、また３年毎にLTS（LongTermSupport、数年間メンテナンスが継続されるバージョン）がリリースされる<br>
<br>
![image](https://user-images.githubusercontent.com/81621944/209455013-07c5db79-488c-4de4-8b85-ef928d730add.png)
<br>

### ●JVM
>・Java Virtual Machine（Java仮想マシン）<br>
>・JRE、JDKに含まれる<br>
>・JavaをWindowsやmacOSなどで動かすために必要となるもの。<br>
>・具体的には、コンパイルされたバイトコードを読み取り、実行するマシン<br>
>・動作させる環境（CPU、OS）毎に用意されているため、同じバイトコードで様々な環境でJavaを動かすことができる<br>
>　（対応CPU：x86系（Intel社、AMD社）、ARM系（ARM社）、対応OS：Windows、macOS、Linux）<br>
<br>

### ●JavaSE
>・Java Standard Edition<br>
>・JRE、JDKに含まれる<br>
>・Javaで使用されるAPIをまとめたもの(java.lang.String クラスなど)<br>
>・定期的にバージョンアップされる為、どのバージョンか分かるようにバージョンを合わせて記述する（JavaSE8、JavaSE13）<br>
<br>

### ●JRE
>・Java Runtime Environment（Java実行環境）、Javaのプログラムを動かすのに必要なセット<br>
>・JVM、JavaSE（API）を含み、JDKに含まれる<br>
<br>

### ●JDK
>・Java Develop Kit（Java開発キット）、Javaの開発や実行に必要となるソフトウェアパッケージ<br>
>・JRE、JVM、JavaSE、コンパイラなどを含む<br>
>・現在のパッケージはJavaSE（Standard Edition）のみ<br>
<br>
![image](https://user-images.githubusercontent.com/81621944/209454682-0b0d3c22-8312-442c-9983-b0d26eff7e84.png)
<br>

### ●OpenJDK
>・現在Javaの開発が進められているプロジェクト（オープンソース）<br>
>・Oracle社の他にも多くの会社、団体、個人がOpenJDKの開発に参加している<br>
<br>
![image](https://user-images.githubusercontent.com/81621944/209454679-2d004e2c-bb49-49b1-8c43-69bffa0120ab.png)
<br>

### ●ディストリビューション
>・配布パッケージとしてビルドされたもの<br>
>・基本的な機能はどのディストリビューションでも大きな違いはない<br>
>・違いがあるのは、セキュリティアップデートの期間、問い合わせサポートの有無・有償/無償、インストーラが付属する/しない<br>
>　(インストーラが付属しない場合はOSのパス設定などが必要な為上級者向け<br>
>・個人利用であればどれを選んでも問題ないが、サービス運用する場合はアップデート期間や有償サポートの有無などを考慮する<br>
&ensp;　（クラウドで動かす場合は、クラウドの会社がディストリビューションを提供していることが多い）<br>
<br>

### ●ビルド
>・Javaを実行するためにソースコードをコンパイラしたバイトコードや、多数のファイルをまとめて作成された実行用のパッケージ<br>
>・記述したソースコードに問題がないかどうかの解析を行い、問題がなければ実行可能なファイルに変換すること<br>
>　（具体的な作業としては、コンパイル、外部ライブラリのリンク、静的解析、テストなど）<br>
>・代表的なビルドツールとして、Maven、Ant、Gradle　などがある<br>
<br>

### ●プロジェクト
>・アプリケーションを目的単位でまとめたもの<br>
<br>

### ●クラス
>・Javaプログラムを構成する１つの単位<br>
>・javaファイルをコンパイルするとクラスファイルが作成される<br>
<br>

### ●JShell
>・REPL(Read Eval Print Loop)という標準ツール<br>
>・Javaのプログラムを１行ずつ実行し動作確認が可能<br>
>・ターミナルを介して「jshell」と入力して起動する（JDKがインストールされていれば実行可能）<br>
<br>

