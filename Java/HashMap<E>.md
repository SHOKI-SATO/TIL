# HashMap<E>

### ▼HashMap<E>とは
&ensp;・`HashMap<E>`クラス　（java.utill　パッケージに含まれるため、インポートが必要）（E:Element（要素））<br>
&ensp;・Mapインターフェースを実装したクラス<br>
&ensp;・Map.ofメソッドと異なり、変更可能<br>
<br>
  
####　特徴
&ensp;・要素数が可変（要素の数にあわせて伸び縮みする配列　のようなイメージ）<br>
&ensp;・要素数の重複が許容されない（キーが重複すると上書きされてしまうので自分で気をつける必要がある）<br>
&ensp;・参照型のみ指定が可能<br>
<br>

●インスタンスの生成<br>
```java
//ジェネリクス（<>）を用いて要素のデータ型を指定
  
//Map型で宣言する場合（基本的にはこちら）
Map<String, String> hmap = new HashMap<>();
//または
HashMap<String> hmap = new HashMap<>();

//varを使う場合は以下の書き方
var hmap = new ArrayList<String> ();
```
※おおまかにList型として捉えられることで、List型で宣言された他インスタンス(LinkedListなど)と型の違いを気にすることなくまとめて処理をおこなえたり、後で型変更をおこなってもコードの変更範囲が少ない<br>
※[詳細はこちら](https://github.com/SHOKI-SATO/TIL/blob/main/%E5%A3%81/20230108_List%E3%81%A8ArrayList%E3%81%AE%E9%81%95%E3%81%84.md)　<br>
<br>


●要素の追加<br>
```java
//インスタンス生成時に要素を追加
jshell> ArrayList<String> alist = new ArrayList<>(Arrays.asList("a","b","c"));
alist ==> [a, b, c]


//addメソッドを利用
jshell> alist.add("a")

//追加する場所を指定
jshell> alist.add(1,"b")

//複数の要素を追加　Collection.addAll
jshell> Collections.addAll(alist,"c","d","e")
```

●要素の上書き<br>
```java
//setメソッドを利用
jshell> alist.set(2,"C");
```

●要素の削除<br>
```java
//要素を指定
jshell> alist.remove(0)

//全て削除
jshell> alist.clear()
```

●要素の出力<br>
```java
//要素を指定
jshell> alist.get(0);
$41 ==> "a"

//全ての要素を出力
  //toString()
jshell>    System.out.print(alist.toString());
[a, b, c, d, e]

//全ての要素を出力
　　//for文
jshell>   for(String ablist : alist){
              System.out.print(ablist);
              }
abcde

//変数名を指定して直接の出力は出来ない
jshell> System.out.pritln(alist)
|  エラー:
|  シンボルを見つけられません
|    シンボル:   メソッド pritln(java.util.ArrayList<java.lang.String>)
|    場所: タイプjava.io.PrintStreamの変数 out
```

<br>
