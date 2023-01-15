//文字列から連続する文字の重複を削除のサンプル

import javax.imageio.plugins.tiff.TIFFImageReadParam;

    //重複するデータを取り除く（拡張for文にて）
public class Main {
    public static void main(String[] args) {
        var data = "abcccbaabcc";
        //1つ前の文字を覚える変数としてprevを用意（previous）
        //データに現れない0にて初期化
        char prev = 0;
        var builder = new StringBuilder();
        //ループを拡張for文で記載
        //toCharArrayメソッドで文字列中の文字を格納した配列を取得
        for (char ch: data.toCharArray()){
            //1つ前の文字と一致するかどうか、変数prevと比較して確認
            if(ch == prev){
                continue;
            }
            //同じ文字が続かなかった倍位はStringBuildderオブジェクトにappendメソッドを使って文字を追加
            builder.append(ch);
            //「1つ前の文字」として変数prevで覚えておく
            prev = ch;
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);

    }
}
