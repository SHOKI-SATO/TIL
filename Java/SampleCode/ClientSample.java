//Clientのサンプル

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//TCP/IP通信
public class Main {
    public static void main(String[] args) throws IOException {

        var domain = "example.com";
        //example.comの80番ポートに接続
        try (var soc = new Socket(domain, 80);
             //OutpuStream（InputStream）では数値などのデータの入出力は行えるが、文字列の入出力には不向き(文字コードの変換が必要になるため)
             //Javaは「UTF-16」、ネットワークのやりとりでは主に「UTF-8」。つまり、送信時は「UTF-16→UTF-8」、受信時は「UTF-8→UTF-16」への変換が必要（Shift_Jis→UTF-16の場合も。。）
             // →文字列を入出力するためにWriterクラス、Readerクラスが用意されている（エンコードの変換をしてくれる）
             // Writerクラス(多くの場合は1行単位での入出力が可能なPrintWriterクラスを使う)
             var pw = new PrintWriter(soc.getOutputStream());
             //InputStreamから直接BufferedReaderオブジェクトを生成できないので、InputStreamReaderクラスを経由
             var isr = new InputStreamReader(soc.getInputStream());
             //Readerクラス
             var bur = new BufferedReader(isr))
        {
            //まずはリクエストを送信
            //送信しているリクエスト「HTTPメソッド（GET/POST）　リソース（操作するデータ）　HTTP/バージョン」
            pw.println("GET /index.html HTTP/1.1");
            //リクエストの詳細情報を表すリクエストヘッダー（必ず指定が必要（サーバー側からはどのドメインからアクセスされたのか分からないため））
            //Host・・・アクセスしているドメイン
            pw.println("Host: " + domain);
            //空行を送ることでリクエストは終了となり、レスポンス待ちになる
            pw.println();
            //ソケットへの出力はある程度まとまってから一気に送信する仕組みになっているので、printlnメソッドを呼び出しですぐ送信されるわけではない
            //→flushメソッドで強制的に送信
            pw.flush();
            //readLineメソッドで1行入力が出来るが、今回はlinesメソッドで文字列のStreamを得ている
            bur.lines()
                    //受け取った文字列の18行分を表示
                    .limit(18)
                    .forEach(System.out::println);

        }

    }
}


//出力結果
//1行目・・・「HTTP/バージョン　ステータスコード　メッセージ」
//　→見るのはステータスコードのみでOK（200＝正常に終了）
//2行目以降・・・レスポンスの詳細情報（レスポンスヘッダーとして送信される）
//　→「Content-Type」＝ドキュメントの種類
//　　「Last-Modified」＝最終更新日時
//　　「Content-Length」＝データサイズ
//    「Content-Type」＝ドキュメントの種類
//空行でレスポンスヘッダーが終わり、それ以降がドキュメント本体
//今回はHTMLが送られている、これを解釈して画面を構築する
