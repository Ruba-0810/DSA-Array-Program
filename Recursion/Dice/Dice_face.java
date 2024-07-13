package Recursion.Dice;
             // face represent the custormer count
              //list dice =6
             // in this custormer give the number
public class Dice_face {
    public static void main(String[] args) {
        dice("",4,9);
    }
    static void dice(String p,int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=face && i<=target;i++){
            dice(p+i,target-i,face);
        }
    }
}
