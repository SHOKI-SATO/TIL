//staticメソッドのサンプル

public class Main {
    public static void main(String[] args) {
        //メソッド呼び出しを変数に格納
        var result = twice(3);
        System.out.println(result);
    }

    //staticメソッドから呼び出す同じクラスのメソッドはstaticメソッドにする必要がある
    // staticメソッドの呼び出しは「クラス名.メソッド名（引数）」とする（今回は同じクラスのメソッドなのでクラス名は省略可能）
    static int twice(int x){
        return x *2;
    }
}

