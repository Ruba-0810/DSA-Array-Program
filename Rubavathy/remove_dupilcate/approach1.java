/* 
TABREZ SIR
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3]
 */
import java.util.*;
class p1{
    public static int[] removeDuplicate(int[] arr,int n){
        int visited=Integer.MIN_VALUE;
        int count=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j] && arr[i]!=visited){
                count++;
                arr[j]=visited;
            }
        }
       }
       int[] array=new int[arr.length-count];
       int k=0;
       for(int i=0;i<n;i++){
            if(arr[i]!=visited){
                array[k]=arr[i];
                k++;
            }
       }
       return array;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,2,3,3};
        int n=arr.length;
        int[] result=removeDuplicate(arr,n);
        System.out.println(Arrays.toString(result));
    }
}
