import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
      int num = 555555;
      Double db = 0.0;
      
      
      
      db = floorDouble((double)num /1000.0f ,2);
      
      System.out.println(Double.toString(db));
      
    
   
    }
    
//   指定精度で値を切り捨て
//     val = 切り捨てたい値
//     precision = 精度
//     return = 指定精度で切り捨てられた値
  
     static double floorDouble(double val, int precision){
        double p = Math.pow(10.0f, (double)precision);
        return Math.floor(val * p) /p;
}
}
