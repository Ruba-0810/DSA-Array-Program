/*
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
*/
import java.util.*;
class p1{
    public static void rightRotation(int[] arr,int n,int d){
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
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
     int[] arr={1,2,3,4,5,6,7};
     int n=arr.length;
     int d=2;
    rightRotation(arr,n,d);
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
    }
    }
}