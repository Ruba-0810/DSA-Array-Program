/*
NORMAL METHOD AND ARRAY IS SORTED
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3]
 */
import java.util.*;
class p1{
    public static int[] removeDuplicateNumber(int[] arr,int n){
        int[] temp=new int[n];
        temp[0]=arr[0];
        int k=0;
        for(int i=1;i<n;i++){
            if(temp[k]<arr[i]){
                k++;
                temp[k]=arr[i];

            }
        }
        int[] array=new int[k+1];
        for(int i=0;i<k+1;i++){
          array[i]=temp[i];
        }
      return array; 
    }
    public static void main(String [] args){
        int[] arr={2,2,3,4,4,5,5,6};
        int n=arr.length;
        int[] result=removeDuplicateNumber(arr,n);
        System.out.println(Arrays.toString(result));
    }
}