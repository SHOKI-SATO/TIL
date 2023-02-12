//インターフェースのサンプル

import javax.naming.Name;
import java.util.List;

public class Main {
    interface Named {
        String name();
    }
    record Student(String name, int score) implements Named {
    }
    record Teature(String name, String subject) implements Named {
    }

    public static void main(String[] args) {
        var people = List.of(new Student("一郎", 80), new Teature("二郎", "Math"));
        for (Named p : people){
            var n = p.name();
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }

}
