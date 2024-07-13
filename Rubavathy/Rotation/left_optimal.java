/*
LEFT_ROTATION IN OPTIMAL SOLUTION

Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
*/
import java.util.*;
class p1{
    public static void leftRotation(int[] arr,int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int a,int b){
        while(a<=b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    public static void main(String [] args){
        int[] arr={7,5, 2, 11, 2, 43, 1, 1};
        int n=arr.length;
        int d=4;
        leftRotation(arr,n,d);
       for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");

    }
}