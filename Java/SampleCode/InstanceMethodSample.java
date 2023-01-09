//インスタンスメソッドのサンプル

public class Main{
    record Student(String name, int englishScore, int mathScore){
        int average(){
            return (this.englishScore() + this.mathScore()) /2;
        }
         int maxScore() {
            //Math.max()メソッド・・・引数に指定された値のうち、大きい方を返す
            return Math.max(englishScore(), mathScore());
        }
    }

    public static void main(String[] args) {
        var kis = new Student("kis", 60, 80);
        var a = kis.average();
        System.out.println("平均点は%d点です".formatted(a));

        int max = kis.maxScore();
        System.out.println("最高点は%dです".formatted(max));
        }
    }
