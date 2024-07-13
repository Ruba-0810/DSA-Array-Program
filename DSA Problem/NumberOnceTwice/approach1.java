/*
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
        int j=0; 
        int count=0;
        for(int i=0;i<arr.length;i++){
           if(arr[j]==arr[i]){
              count++;
           }
        }
        if(count==1){
            return arr[j];
        }
        return -1;
    } 
    public static void main(String[] args){
        int[] arr={4,1,2,1,2};
        System.out.println(numberTwice(arr));
    }
}