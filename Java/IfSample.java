//基本の形
class Ifsample{
    public static void main (String[] args) {
        int i = 10;
        if(i<3){
            System.out.println("3より小さい");
        }else if(i<5){
                System.out.println("5より小さい");
        }else{
            System.out.println("iは大きな数");
            }
        
        
        //if文が一行飲みの場合は{}を省略することも可能
         if(i<10)
        System.out.println("10より小さい");
        
        //しかし、可読性が下がるため、記述も以下のように一行するべき
        if(i == 10) System.out.println("iは10");
        
        }
    }



