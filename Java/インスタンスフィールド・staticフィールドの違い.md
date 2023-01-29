# インスタンスフィールド / staticフィールドの違い

## ▼インスタンスフィールド / staticフィールドの違い

#### ●違い
>○インスタンスフィールド<br>
>>インスタンス毎に領域が用意される<br>
<br>

>○staticフィールド<br>
>>クラスに１つだけ領域が用意される<br>
<br>



#### ●違い（コードで確認）
```java
//●インスタンスフィールド

//クラス作成
class A {
String s;
}

//インスタンス生成
var a1 = new A();
var a1 = new A();

//それぞれに要素を割り当てる
a1.s = "Hello";
a2.s = "World"

//出力
a1.s + a2.s
>>HelloWorld
```
<br>
→`Hello`と`World`が両方とも保持されている<br>
<br>

```java
//●staticフィールド

//クラス作成
class B {
String s;
}

//インスタンス生成
var b1 = new B();
var b1 = new B();

//それぞれに要素を割り当てて出力
b1.s = "Hello";
b2.t
>>Hello

b2.s = "World";
b1.t
>>World
```
<br>
→変数１を経由しても、変数２を経由しても、同じstaticフィールドを扱っている<br>
<br>


#### ※staticフィールドを使用するとどのような動作かが分かりづらくなるので、使用する際はインスタンスではなくクラスを経由して扱う

