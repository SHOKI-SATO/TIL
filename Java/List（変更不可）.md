# List（変更不可）

### ▼List（変更不可）とは
&ensp;・List.of()メソッドで作成が可能なリスト<br>
&ensp;・nullを許容しない<br>
<br>

●要素の格納<br>
```java
//型が混在しても問題ない
jshell> List list = List.of("a","b",2);
list ==> [a, b, 2]

//引数が変数でも問題ない
jshell> Integer[] array1 = {1,2,3};
array1 ==> Integer[3] { 1, 2, 3 }

jshell> List list = List.of(array1);
list ==> [1, 2, 3]
```

●要素の取得<br>
```java
//要素を指定（先頭要素は０）
jshell> list.get(1);
$17 ==> "b"

//全要素を取得
jshell> System.out.println(list)
[a, b, 1]
```

●要素数の取得<br>
```java
jshell> list.size();
$18 ==> 3
```

※変更は不可、nullを許容しない<br>
```java
//変更（追加）は出来ない
jshell> list.add("d");
|  例外java.lang.UnsupportedOperationException

//nullを許容しない
jshell> List list = List.of(1,2,null);
|  例外java.lang.NullPointerException
```
<br>

ArrayListなど、変更のできるListも用意されている<br>
<br>


