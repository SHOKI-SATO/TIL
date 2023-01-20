# ▼StringUtills.isEmpty()メソッドがエラーになる<br>
<br>

●詳細（画像があれば）<br>
>データのnull条件を追加しようと、`StringUtills.isEmpty()`を利用しようとしたところ、`isEmpty()はStringUtillsクラスでは未定義です`と表示される<br>
>`StringUtills.isNullOrEmpty()`を他で既に利用しており、StringUtillsクラスもインポート済みの状態<br>
<br>

●やったこと<br>
>StringUtills.isNullOrEmpty()の利用箇所からコピペしてStringUtills.isEmpty　にしたが同様の状態になる<br>
>調べたところ、そもそも`StringUtills.isEmpty()`では`""（ブランク）`は判定出来るがnullはエラーになる<br>
<br>

●考えた原因<br>
>分からない<br>
<br>

●実際の原因<br>
>分からない<br>
<br>

●対応<br>
>`StringUtills.isNullOrEmpty()`を利用<br>
>→引数となるDBの値をnullにしたところエラーとなった<br>
>→`null != 値`としたところエラーが解消し、値を入れても期待通りの出力となるため記載を修正した<br>
>>調べたところ、今回は`Objects.isNull()`が良さそうだが、`null == 値`と何が違うのか<br>
>>→JavaDocを見たところ、`Objects.isNull()`は`StreamAPI`のために存在する<br>
>>`null==値`を使うかはどちらでもお好きな方で（個人的には`null==値`が簡単で分かりやすい）<br>
<br>

●参考URL<br>
>https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/Objects.html#isNull(java.lang.Object)
>>Objects.isNull()のJavaDoc<br>

>https://debimate.jp/2021/05/17/%E3%80%90%E5%8F%AF%E8%AA%AD%E6%80%A7%E5%90%91%E4%B8%8A%E3%80%91java-utils-objects-isnull%E3%81%AB%E3%82%88%E3%82%8Bnull%E3%83%81%E3%82%A7%E3%83%83%E3%82%AF%E3%80%90%E9%96%A2%E6%95%B0%E5%9E%8B/
>>Objects.isNull()は`StreamAPI`の記述で可読性を上げるために存在する（ただし、その場合も`null==値`でも書けるため、本当にどちらでもいい）<br>
<br>
