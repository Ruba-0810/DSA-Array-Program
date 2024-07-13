/*
/*
WITH EXTRA SPACE:
/*
 * Given an integer array nums and an integer val, 
remove all occurrences of val in nums in-place. 
The order of the elements may be changed. 
Then return the number of elements in nums which are not
 equal to val.

Consider the number of elements in nums which are not equal 
to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums 
contain the elements which are not equal to val. 
The remaining elements of nums are not important as well as the 
size of nums.

Return k.

Test Case 1: 

	Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]

Test Case 2: 

	Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]


 */
import java.util.*;
class p1{
    public static int[] removekelement(int[] arr,int k,int n){
        int j=0;
        for(int i=0;i<n;i++){
             if(arr[i]!=k){
                arr[j]=arr[i];
                j++;
             }
        }
        System.out.println(j);
       for(int i=0;i<j;i++){
        arr[i]=arr[i];
       }
       return arr;
    }
    public static void main(String[] args){
        int[] arr={0,1,2,2,3,0,4,2};
        int n=arr.length;
        int k=2;
       // int count=removekelement(arr,k,n);
       int[] result=removekelement(arr,k,n);
       System.out.println(Arrays.toString(result));
    //     System.out.print(count+" ");
    //     for(int i=0;i<count;i++){
    //     System.out.print(arr[i]+" ");
    //   }
    }
}