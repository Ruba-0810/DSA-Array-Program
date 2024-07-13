/*
Move all Zeros to the end of the array
Example 1:
Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

 [TWO POINTER]
*/
import java.util.*;
class p1{
    public static int[] moveAllZero(int[] arr,int n){
        int j=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               j++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n=arr.length;
        int [] result=moveAllZero(arr,n);
        System.out.println(Arrays.toString(result));
    }
}