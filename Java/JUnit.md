# JUnit

## ▼JUnitとは
>・Javaで動作確認（テスト）の自動化に標準的なフレームワーク<br>
<br>

### ●セットアップ方法
>・<br>
>・<br>
<br>


### ●アサーションメソッド
>・実行結果が期待した会いたいになることを確認・検証するメソッド<br>
>・`assertEquals`メソッドなどのようなメソッド<br>
```java
//構文
assertEquals(期待値, 実際の値 [, テスト内容を表すメッセージ])
//例
assertEquals(4, new Calc().add(2, 2), "2 + 2 = 4");
```
>テスト内容を表すメッセージは省略可能だが、失敗した時に表示されるため極力記載すべき<br>
<br>

#### ○アサーションメソッドの種類
|  アサーションメソッド  |  確認内容  |
| :---- | ----: |
|  assertEquals(期待値, 式 [,メッセージ])  |  式が期待値と一致することを確認する  |
|  assertNotEquals(期待値, 式 [,メッセージ])  |  式が期待値と異なることを確認する  |
|  assertTrue(式 [,メッセージ])  |  式がtrueを返すことを確認する  |
|  assertFalse(式 [,メッセージ])  |  式がfalseを返すことを確認する  |
|  assertNull(式 [,メッセージ])  |  式がnullを返すことを確認する  |
|  assertNotNull(式 [,メッセージ])  |  式がnullを返さないことを確認する  |
|  assertThrows(例外クラス, ラムダ式 [,メッセージ])  |  式が例外を投げることを確認する  |
|  assertAll(ラムダ式...)  |  複数のテストを全て実行する  |
<br>

>使用例<br>
```java
//例外NumberFormatExeptionが投げられることを期待するテスト
assertThrows(NumberFormatExeption.class, () - > Integer.parseInt("¥10,000"), "¥や,が入っているのでパース出来ない");

//例外が投げられないことを期待するテスト
assertDoesNotThrow(() - > new Calc().add(-100, 10), "負の値を渡しても例外は出ない");

//複数のアサーションメソッドを必ず実行するテスト
assertAll(() - > aassertEquals(4, new Calc().add(2, 2), "2 + 2 = 4"),
          () - > assertEquals(6, new Calc().add(2, 4), "2 + 4 = 8"));
```
<br>
