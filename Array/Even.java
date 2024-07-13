/*
INPUT:[1,6,9,0,25,16]
OUput:3
*/
import java.util.*;
class p1{
    public static int evenNumber(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       int length=sc.nextInt();
       int[] arr=new int[length];
       for(int i=0;i<length;i++){
        arr[i]=sc.nextInt();
       }
        System.out.println(Arrays.toString(arr));
        System.out.println(evenNumber(arr));
    }
}