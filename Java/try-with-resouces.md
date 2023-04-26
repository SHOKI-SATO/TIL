# try-with-resouces

## ▼try-with-resoucesとは
>・例外が起きた際も必ずリソースの解放（接続の解除）を行うようにするための構文<br>
>>（解放しないと、、）<br>
>>ファイルの場合・・・他のプログラムが同じファイルを開くことが出来ないということが起きる可能性<br>
>>データベースの場合・・・接続できる上限数に達してしまって、あるタイミングから接続が出来なくなる可能性<br>
<br>

### ▼コード
```java
try(closeが必要なオブジェクトの変数割り当て){
    処理
}
```
>処理が終わってtryブロックを抜ける際に、自動的に`()`に指定したオブジェクトのcloseメソッドが呼び出される

```java
//例
 try(var soc = new Socket("localhost", 1600);
     OutputStream is = soc.getOutputStream())
{
     is.write(234);
}
```
