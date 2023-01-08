# getter,setter

### ▼getter,setterとは
&ensp;・カプセル化されたカプセル化された変数を書き換える関数<br>
&ensp;・どちらも外部から扱える必要があるため、`public`で記載する<br>
&emsp; **getter　→ 取得する**<br>
&emsp; **setter　→ 変更する**<br>
<br>

#### ●基本構文
&ensp;**○getter**<br>
```java
// フィールド変数
private int number;

// number変数に対してのGetter
public int getNumber() {
    return this.number;
}
```
<br>

&ensp;**○setter**<br>
```java
// フィールド変数
private int number;

// number変数に対してのsetter（setのみで戻り値なしのため、voidを指定）
public void setNumber(int number) {
    this.number = number;
}
```
&ensp;※setterでsetする値にチェックをつける<br>
```
// フィールド変数
private int フィールド名;

// setter
public void setフィールド名(int 引数名) {
    if ( 条件式 ){
    this.フィールド名 = 引数名;
    }
}
```
<br>
