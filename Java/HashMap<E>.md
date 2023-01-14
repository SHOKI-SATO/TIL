# HashMap<E>

## ▼HashMap<E>とは
>・`HashMap<E>`クラス　（java.utill　パッケージに含まれるため、インポートが必要）（E:Element（要素））<br>
>・Mapインターフェースを実装したクラス<br>
>・Map.ofメソッドと異なり、変更可能<br>
<br>
  
### ▼特徴
>・要素数が可変（要素の数にあわせて伸び縮みする配列　のようなイメージ）<br>
>・要素数の重複が許容されない（キーが重複すると上書きされてしまうので自分で気をつける必要がある）<br>
>・参照型のみ指定が可能<br>
<br>

### ▼コード
#### ●インスタンスの生成
```java
//ジェネリクス（<>）を用いて要素のデータ型を指定
  
//Map型で宣言する場合（基本的にはこちら）
Map<String, String> hmap = new HashMap<>();
//または
HashMap<String> hmap = new HashMap<>();

//varを使う場合は以下の書き方
var hmap = new HashMap<String, String> ();
```
※おおまかにMap型として捉えられることで、Map型で宣言された他インスタンス(LinkedHashMapなど)と型の違いを気にすることなくまとめて処理をおこなえたり、後で型変更をおこなってもコードの変更範囲が少ない<br>
※[詳細はこちら](https://github.com/SHOKI-SATO/TIL/blob/main/%E5%A3%81/20230108_List%E3%81%A8ArrayList%E3%81%AE%E9%81%95%E3%81%84.md)　<br>
<br>


#### ●要素の追加
```java
//putメソッドを利用
jshell> hmap.put("a","A")

//既存のキーを指定したら要素が上書きされる
jshell> hmap.put("a","AA")
```

#### ●要素の削除
```java
//要素を指定
jshell> hmap.remove("a")

//全て削除
jshell> hmap.clear()
```

#### ●要素の出力
```java
//要素を指定
jshell> hmap.get("a")
$13 ==> "AA"

//全ての要素を出力
  //toString()
jshell> System.out.print(hmap.toString());
{a=AA}

//全ての要素を出力
　　//for文
```
<br>
