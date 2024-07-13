/*
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
*/
import java.util.*;
class p1{
    public static int[] rightRotation(int[] arr,int d){
        int n=arr.length;
        int[] temp=new int[n-d];
        for(int i=0;i<n-d;i++){
           temp[i]=arr[i];
        }
        for(int i=n-1;i>=n-d;i--){
            arr[i-(n-d)]=arr[i];
        }
        
        for(int i=0;i<temp.length;i++){
            arr[d+i]=temp[i];
        }
        return arr;
    }
    public static void main(String [] args){
        int[] arr={1,2,3,4,5,6,7};
        int d=2;
        int[] ans=rightRotation(arr,d);
        System.out.println(Arrays.toString(ans));
    }
}