package Recursion.Dice;

import java.util.ArrayList;

public class Dice_Arraylist {
    public static void main(String[] args) {
        ArrayList<String>ans=dice("",4);
        System.out.println(ans);

    }
    static ArrayList<String>dice(String p, int target){
        if(target==0){
            ArrayList<String>list=new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String>answer=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            answer.addAll(dice(p+i,target-i));
        }
        return answer;
    }
}
