package Insertionsort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[]num={5,3,4,1,2};
        insert(num);
        System.out.println(Arrays.toString(num));
    }
    static void insert(int[]num){
        for(int i=0;i< num.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(num[j]<num[j-1]){
                   int temp=num[j];
                   num[j]=num[j-1];
                   num[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
