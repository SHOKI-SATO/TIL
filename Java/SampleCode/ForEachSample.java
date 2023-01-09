//拡張for文

import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        //配列の場合
        var nums = new int[]{2, 3, 5, 7};
        for (int num: nums)  {
            System.out.println(num);
        }
        
        //リストの場合  
        var strs = List.of("apple", "banana", "grape");
        for (String str : strs) {
            System.out.println(str);

        }
    }
}
