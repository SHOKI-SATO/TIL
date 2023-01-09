//二重ループ

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d | ", i * j );    //数値の整形結果が最低２文字になるように左にスペース
            }
            System.out.println();

        }
    }
}
