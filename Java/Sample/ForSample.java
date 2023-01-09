//基本の形
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("finish");
                break;
            }
            System.out.println(i);
        }
    }
}
