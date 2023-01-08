class Main {
    public static void main(String[] args) {
        var a = 6;
        //Java14から導入された形式
        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            default -> System.out.println("noting");
        }
        
        //Java7,Java11では以下の形式で記述する
        switch (a) {
            case 1:
            case 2:
                System.out.println("one-two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("noting");
                break;
        }
        
        //上記はどの分岐になった場合も出力をしているので、switch式に書き換える
        System.out.println(switch(a){
           case 1,2 -> "one-two";
           case 3 -> "three";
           case 4 -> "four";
           case 5 -> "five";
           default -> "noting";
        });
    }
}
