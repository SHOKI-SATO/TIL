# ▼ListとArrayListの違い<br>
<br>

●詳細（画像があれば）<br>
ListとArraｙListが変更出来る/出来ないの違いくらいでどういう関係のものかがあやふや<br>
ArrayListを宣言するときに格納する変数の型やジェネリクスがどうするのが正解かがわからない<br>
```java
List<String> list = new ArrayList<String>();
ArrayList<String> list = new ArrayList<String>();
List<String> list = new ArrayList<>();
ArrayList<String> list = new ArrayList<>();
List list = new ArrayList<String>();
List list = new ArrayList<>();
List list = new ArrayList();
var list = new ArrayList<String>();
var list = new ArrayList();
```
<br>

●やったこと<br>
・<br>
<br>

●考えた原因<br>
・<br>
<br>

●実際の原因<br>
・Listインターフェースを継承したクラスがArrayListクラス　と理解してなかった<br>
・ダイヤモンド演算子<>が以前は存在しない　→　記述方法が変わった ことを理解してなかった<br>
・ダイヤモンド演算子を「<>」と「<E>」で混在していた<br>
<br>

●結論<br>
・ArrayListの宣言時には基本的にList<E>型を利用する<br>
・varを指定する際は型推論のために右のジェネリクスに
・以前はダイヤモンド演算子「<>」がなかったので、<E>と記載しないといけなかった<br>
・更に以前はジェネリクスによるデータ型の指定がなかったので<E>の記載がなかった<br>
```java
//（最初）当初はこのように書くしかなかったが
List list = new ArrayList();

//（以前）ジェネリクスによる型指定が出来るようになり、
List<String> list = new ArrayList<String>();

//（今）ダイヤモンド演算子が追加されたことで、右側のジェネリクスによるデータ型の指定が必要なくなった
List<String> list = new ArrayList<>();
```
<br>
  
```java
List<String> list = new ArrayList<String>();  //問題ないが、今は右辺の<String>を<>に省略可能
ArrayList<String> list = new ArrayList<String>(); //問題ないが、ArrayList<String>ではなくList<String>にした方がいい、また今は右辺の<String>を<>に省略可能
List<String> list = new ArrayList<>();  //★基本この形式でOK
ArrayList<String> list = new ArrayList<>(); //問題ないが、ArrayList<String>ではなくList<String>にした方がいい
List list = new ArrayList<String>();  //List<E>とデータ型を指定していないので、作成したListにString/int/Object型となんでもadd出来てしまう、また今は右辺の<String>を<>に省略可能
List list = new ArrayList<>();  //List<E>とデータ型を指定していないので、作成したListにString/int/Object型となんでももadd出来てしまう
List list = new ArrayList();   //当初はこの形式だったが、ジェネリクスでデータ型を指定していないので、作成したString/int/Object型となんでもadd出来てしまう
var list = new ArrayList<String>(); //★この形式でもOK（varは型推論なので、コンパイル時にArrayListとして扱う）
var list = new ArrayList(); //右辺でジェネリクスでデータ型を指定していないので、作成したListにString/int/Object型となんでもadd出来てしまう
```
<br>

●参考URL<br>
  https://it-kyujin.jp/article/detail/1376/
  <br>
  https://saycon.co.jp/portal-for-newcomer/javase8/java-15
  <br>
<br>

