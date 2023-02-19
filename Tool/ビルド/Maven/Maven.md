# Maven

## ▼Maven（Apache Maven）とは
>・Javaアプリケーション開発の現場で最も使用されているビルドツール<br>
>・Apacheソフトウェア財団というオープンソースソフトウェアプロジェクトを支援する財団のプロジェクト<br>
>・全てのJava IDEにMavenが内蔵されているため、別途インストールは不要（開発サーバなどに対してIDEとは独立して導入する場合は、Mavenの公式サイトからダウンロード）
>>または、`Homebrew`や`SDKMAN!`といったコマンドラインツールからインストールも可能<br>
><br>

### ●Goal
>Mavenで実行できるコマンドのこと<br>
>実行するには、`Ctrl`を2回押すと表示される「なんでも実行」ウインドウで`mvn Goal名`を入力しEnterを押す（または、Mavenツールウインドウの「ライフサイクル」内で実行したいGoalをダブルクリック）<br>

>○compile<br>
>>ソースコードのコンパイルを行う<br>
>>`src/main/java`以下のソースコードをコンパイルしたクラスファイルと、`src/main/resource`以下のリソースファイルを`target/classes`以下に配置し、<br>
>>`src/test/java`以下のソースコードをコンパイルしたクラスファイルと`src/test/resource`以下のリソースファイルを`target/test-classes`以下に配置する<br>

>○test<br>
>>compileを行った上で、`src/test/java`以下にあるテストを実行する<br>

>○package<br>
>>testを行った上でモジュールのパッケージングを行う<br>
>>デフォルトでは`target/classes`以下のクラスをまとめたJARファイルが`target/[artifactId]-[version].jar`に作られる<br>

>○clean<br>
>>targetディレクトリを削除する<br>
<br>

