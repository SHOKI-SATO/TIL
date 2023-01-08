# ArrayList<E>

### ▼ArrayList<E>　とは
&ensp;・ArrayList<E>　クラス（java.utill　パッケージに含まれるため、インポートが必要）<br>
&ensp;・コレクションクラス（複数のオブジェクトをまとめて管理できるクラスをまとめたもの）のひとつ<br>
&ensp;・List.of()メソッドで作成したListと異なり、要素の変更が可能<br>
&ensp;・`ArrayList<E>`まででクラス名　（E:Element（要素））<br>
<br>

●インスタンスの生成<br>
```java
//ジェネリクス（<>）を用いて要素のデータ型を指定
jshell> ArrayList<String> alist = new ArrayList<String>();
alist ==> []
```

●要素の追加<br>
```java
//addメソッドを利用
jshell> alist.add("a")

//追加する場所を指定
jshell> alist.add(1,"b")

//複数の要素を追加　addAll



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

//


//変数名を指定して直接の出力は出来ない
jshell> System.out.pritln(alist)
|  エラー:
|  シンボルを見つけられません
|    シンボル:   メソッド pritln(java.util.ArrayList<java.lang.String>)
|    場所: タイプjava.io.PrintStreamの変数 out



```

<br>
