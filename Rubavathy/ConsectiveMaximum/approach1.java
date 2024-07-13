/*
Example 1:

Input: prices = {1, 1, 0, 1, 1, 1}

Output: 3

Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
*/
import java.util.*;
class p1{
    public static int consecutiveMaximum(int[] arr){
        int maximum=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
            }
            maximum=Math.max(maximum,count);
        }
        return maximum;
    }
    public static void main(String[] args){
        int[] arr={1, 1, 0, 1, 1, 1,1,1};
        System.out.println(consecutiveMaximum(arr));
    }
}