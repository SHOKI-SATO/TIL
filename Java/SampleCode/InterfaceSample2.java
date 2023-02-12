//インターフェースのサンプル2

import javax.naming.Name;
import java.util.List;

public class InterfaceSample2 {
    //インターフェースを定義（戻り値とメソッド名（必要であれば引数の定義）のみを記載）
    interface Named {
        String name();
    }
    //インターフェースの実装（implements　の後にインターフェース名を指定）
    record Student(String name, int score) implements Named {
    }
    record Teature(String name, String subject) implements Named {
    }

    public static void main(String[] args) {
        var people = List.of(new Student("一郎", 80), new Teature("二郎", "Math"));
        //変数pの型を示すとNamedになる
        for (Named p : people){
            var n = p.name();
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }

}
