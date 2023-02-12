//継承・抽象クラスのサンプル

import java.util.List;

public class Main {
    //抽象クラス
    static abstract class User {
        String name;

        User(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        //抽象メソッド（メソッドの処理を持たず、シグネチャだけを定義するメソッド）
        abstract String profile();

        //(Objectクラスの)オーバーライド
        @Override
        public String toString() {
            return profile();
        }
    }

    static class Student extends User {
        int score;

        Student(String name, int score) {
            super(name);
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        @Override
        String profile() {
            return "学生 %s, %d点".formatted(getName(), getScore());
        }

        static class Teacher extends User {
            String subject;

            Teacher(String name, String subject) {
                super(name);
                this.subject = subject;
            }

            public String getSubject() {
                return subject;
            }

            @Override
            String profile() {
                return "先生 %s, 教科 %s".formatted(getName(), getSubject());
            }
        }

        public static void main(String[] args) {
            //Userオブジェクトを持つListとしているが、継承の場合は「サブクラスはスーパークラスの一種（is-a関係）」となるので、サブクラスであるStudentクラスとTeacherクラスも格納できる
            List<User> people = List.of(new Student("一郎", 80), new Teacher("二郎", "Math"));
            for (var p : people) {
                System.out.println("こんにちは"+ p.name + "さん");
                System.out.println(p);
            }
        }
    }
}

