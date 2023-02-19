# Javadoc

## ▼Javadocとは
>・Javaプログラムの仕様を記したドキュメント（クラスやメソッドを利用する人向けのドキュメント）<br>
>・javadocコマンドでHTML形式に変換され、ブラウザやIDEで閲覧出来るようになる<br>
<br>

### ●得られる情報
>・クラスやメソッドの仕様<br>
>・どのような引数を渡すべきなのか<br>
>・どのような状況で例外が発生するのか<br>
>・クラスやメソッドが導入されたバージョン<br>
<br>

### ●Javadocの書き方
>・Javadocコメント（`/**コメント*/`）としてソースコード内のクラスやメソッドの前に記述する<br>
```java
 /**
     *渡された西暦年が夏季オリンピック開催年であるかどうか判定する
     * @param year 西暦年
     * @return 夏季オリンピック開催年であればtrue
     * @throws IllegalArgumentException まだオリンピック開催が確定していない年を渡した場合
     */
    public boolean isSummerOlympicYear(int year)throws IllegalArgumentException{
        if(2032 < year){
            throw new IllegalArgumentException("2023年までをサポートしています。入力：" + year);
        }
        return year % 4 == 0;
    }
```
<br>

>以下のようなJavadocが作成される
<img width="761" alt="スクリーンショット 2023-02-19 16 45 15" src="https://user-images.githubusercontent.com/81621944/219935646-674a4c3a-b5ea-4ca8-aeef-c569a10dc15e.png"><br>
<br>



#### ○タグ

|  タグ  |  内容  |
| :---- | ----: |
|  @param  |  パラメータに関する説明（どのような値を渡すべきか、値が取り得る範囲など）  |
|  @return  |  戻り値に関する説明（どのような時にどのような値を返すか、nullを返す条件など）  |
|  @throws  |  発生する可能性のある例外に関する説明（どのような時に例外が発生するか）  |
|  @since  |  導入されたバージョンを指定  |
|  @version  |  現在のバージョンを指定  |
<br>
