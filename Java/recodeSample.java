//レコード　：　項目に名前をつけ、型を指定して扱える　
public class Main {
    public static void main(String[] args) {
        var person = new Person("Mario", 26);

        System.out.println(person.name());    // Mario
        System.out.println(person.age());     // 26
        
        System.out.println(person.toString());     // Person[name=Mario, age=26]

    }
}

// recordの定義
record Person(String name, int age) {}
