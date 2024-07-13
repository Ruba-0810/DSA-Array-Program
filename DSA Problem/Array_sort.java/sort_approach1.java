/*
Check if an Array is Sorted
Input:
 N = 5, array[] = {1,2,3,4,5}
Output: 
True.

Input:
 N = 5, array[] = {5,4,6,7,8}
Output:
 False.
*/
import java.util.*;
class p1{
    public static boolean checkIfSort(int[] arr,int n){
        boolean ruba=true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                  ruba=false;
                }
            }
        }
        return ruba;
    }
    public static void main(String[] args){
        int[] arr={5,6,7,8};
        int n=arr.length;
        boolean ruba=checkIfSort(arr,n);
        System.out.println(ruba);
    }
}