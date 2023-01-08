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

●やったこと<br>
・<br>
<br>

●考えた原因<br>
・<br>
<br>

●実際の原因<br>
・Listインターフェースを継承したクラスがArrayListクラス　と理解してなかった<br>
・ダイアモンド演算子<>が以前は存在しない　→　記述方法が変わった ことを理解してなかった<br>
・ダイアモンド演算子「<>」と「<E>」を混在していた<br>
<br>

●結論<br>
・<br>
・<br>
```java
List<String> list = new ArrayList<String>();  //基本の形（ArrayListクラスはListインターフェースを実装しているクラスなのでList型を指定可能）
ArrayList<String> list = new ArrayList<String>(); //ArrayListをインスタンスかしているのでこれが普通だと思うか、List型にした方が色々便利
List<String> list = new ArrayList<>(); //List<String>で型を指定してるので右のジェネリクスの指定は省略可能
List list = new ArrayList<>();
List list = new ArrayList();
```
<br>

●参考URL<br>
  https://it-kyujin.jp/article/detail/1376/
  <br>
  https://saycon.co.jp/portal-for-newcomer/javase8/java-15
  <br>
<br>
<br>
