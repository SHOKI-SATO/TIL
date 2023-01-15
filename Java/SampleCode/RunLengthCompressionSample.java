//ランレングス圧縮のサンプル

//ランレングス圧縮　データが連続した個数から2を引いた数字を出力
public class Main {
    public static void main(String[] args) {
        //1番目の文字を出力する場合「−1」となる　→基準となる定数を定義
        final var CONTENER_BASE = -1;
        var data = "abbcccbaaaabcccccccccccddd";

        //同じ文字が連続した個数を数えるための変数
        var count = CONTENER_BASE;
        //1つ前の文字を覚えておく変数
        char prev = 0;
        //結果出力用のbuilderオブジェクトを用意
        var builder = new StringBuilder();
        //1文字ずつ処理するループ
        for(var ch : data.toCharArray()){
            //同じ文字が続くとき（countを増やすことで重複を数える）
            if(prev == ch){
                count++;
                //countが9まで来たら9を出力
                //出力後はループ開始前の状態に戻す（countをCOUNTER_BASEに、1つ前の文字を0に）
                if(count == 9){
                    builder.append('9');
                    count = CONTENER_BASE;
                    prev = 0;
                }
                //違う文字が来たとき
            }else {
                //countが0以上であれば、直前に同じ文字が続いていたということで数字を追加
                //count は　COUNTER_BASE に戻す
                if(count >= 0){
                    //前の文字が連続していたので数字を出力
                    builder.append((char)('0' + count));
                    count = CONTENER_BASE;
                }
                //現在の文字をbuilderに追加
                //一つ前の文字として現在の文字をprevに割り当てる
                builder.append(ch);
                prev = ch;
            }
        }
        //ループを抜けたとき、最後の文字が連続していれば数字を出力
        if(count >= 0){
            builder.append((char)('0' + count));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
