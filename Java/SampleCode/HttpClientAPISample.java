//HttpClientAPIのサンプル

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Webサイトに接続するプログラム（クライアント）
//HttpClientAPIを用いた通信
//大きく、①HttpClientの用意　②HttpRequestの用意　③用意したHttpRequestを送りレスポンス処理　の3つに分かれる
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //①HttpClient.newHttpClientメソッドを使いHttpClientオブジェクトを取得（タイムアウト、プロキシなど通信の設定も可能）
        HttpClient client = HttpClient.newHttpClient();
        
        //②リクエストをHttpRequestとして準備
        //今回はURIクラスを使いURI指定（http://~）
        //　→用意されたライブラリを使うと、「https」とプロトコル名を指定するだけで適した方式で通信をしてくれる
        URI uri = URI.create("https://example.com/");
        HttpRequest req = HttpRequest.newBuilder(uri).build();
        
        //③HttpClientに対してsendメソッドでHttpRequestを送る、その際にレスポンスの処理方法をBodyHandlerとして指定
        //　今回はofStringを利用してレスポンスを文字列として受け取るようにする　
        HttpResponse<String> response = client.send(
                req, HttpResponse.BodyHandlers.ofString());
        
        //HttpResponseに対してbodyメソッドを呼び出すとデータ本体が得られる（ofStringを指定したのでString型として得られる）
        //HttpResponseからはレスポンスヘッダーなども得られる
        String body = response.body();
      
        //あとは、受け取ったデータから先頭の5行を表示
        //ここではレスポンスヘッダーは表示せず、データ本体のHTMLのみを表示した
        body.lines()
                .limit(5)
                .forEach(System.out::println);

    }
}
