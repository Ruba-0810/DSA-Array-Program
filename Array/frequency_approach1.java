
/*APPROACH 1
 * Write a method to find the frequency of each element in 
 * the given integer array.
    Test Case 1: 

	Input :  [1, 8, 6 , 1 , 0 , 8]
	Output :    1 : 2 
                8 : 2 
                6 : 1 
                0 : 1 ​


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :    2 : 3 
                3 : 2 

 */

import java.util.*;
class p1{
    public static void frquency(int[] arr){
        int visited=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(arr[i]!=visited){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] ){
                    arr[j]=visited;
                    count++;
                }
            }
             System.out.println(arr[i] + " : "+ count);
        }
        }
    }
    public static void main(String[] args){
       int[] arr={2,3,2,3,4,5,6,6};
       frquency(arr);
    }
}