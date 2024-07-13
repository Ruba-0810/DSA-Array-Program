/*
USING HASHSET
Find the number that appears once, and the other numbers twice
Example 1:
Input Format:
 arr[] = {2,2,1}
Result:
 1
Explanation:
 In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format:
 arr[] = {4,1,2,1,2}
Result:
 4
*/
import java.util.*;
class p1{
    public static int numberTwice(int[] arr){
        //HashSet<Integer> hash=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
            max=arr[i];
           }
        }
        //convert add the count of number in array
        int[] array=new int[max+1];
        for(int i=0;i<arr.length;i++){
            array[arr[i]]=array[arr[i]]+1;
        }
        for(int i=0;i<arr.length;i++){
            if(array[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={4,4,1,2,1,2,5};
        System.out.println(numberTwice(arr));
    }
}