# Map（変更不可）

### ▼Map（変更不可）とは
&ensp;・Map.of()メソッドで作成が可能なMp<br>
&ensp;・nullを許容しない<br>
<br>

●要素の格納<br>
```java
//キー/バリューの組み合わせでデータを格納（型が混在しても問題ない）
jshell> Map num  = Map.of(1,"one",2,"two")
num ==> {2=two, 1=one}
```

●要素の取得<br>
```java
//要素を指定（キーを引数に指定）
jshell> map.get(1)
$4 ==> "one"


//全要素を取得
jshell> System.out.println(list)
[a, b, 1]
```

●要素数の取得<br>
```java
jshell> map.size()
$5 ==> 2
```

※変更は不可、nullを許容しない<br>
```java
//変更（追加）は出来ない
jshell> map.put(3,"three")
|  警告:
|  raw型java.util.Mapのメンバーとしてのput(K,V)への無検査呼出しです
|  map.put(3,"three")
|  ^----------------^
|  例外java.lang.UnsupportedOperationException


//nullを許容しない
jshell> Map map = Map.of(1,1,2,2,3,null)
|  例外java.lang.NullPointerException

```
<br>

HashMapなど、変更のできるMapも用意されている<br>
<br>


