package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateValue {
    public static void main(String[] args) {
      int[]num={4,3,2,7,8,2,3,1};
        System.out.println(duplicate(num));

    }
    static List<Integer> duplicate(int[]num){
        int i=0;
        while(i< num.length){
           int check=num[i]-1;
           if(num[i]!=num[check]){
               swap(num,i,check);
           }
           else{
               i++;
           }
        }
        List<Integer>ans=new ArrayList<>();
        for(int index=0;index<num.length;index++) {
            if (num[index] != index + 1) {
                ans.add(index + 1);
            }
        }
            return ans;
    }
    static void swap(int[]num,int first,int second){
        int temp=num[first];
        num[first]=num[second];
        num[second]=temp;
    }
}
