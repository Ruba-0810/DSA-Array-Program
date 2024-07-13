/*
Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}
Output: 1
*/
import java.util.*;
class p1{
    public static int linearSearch(int[] arr,int k,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int k=6;
        int n=arr.length;
        System.out.println(linearSearch(arr,k,n));
    }
}