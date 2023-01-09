//for文のサンプル

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("finish");
                break;  //ループの終了、次の処理に移る（continue:次のループ処理に移る）
            }
            System.out.println(i);
        }
    }
}
