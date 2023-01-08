//基本の形
class Main {
    public static void main(String[] args) {
        var a = 6;
        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            default -> System.out.println("noting");
        }
    }
}
