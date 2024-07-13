/*APPROAH 2[USING HAHSET]
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
       HashSet<Integer>hash=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        hash.add(arr[i]);
       }
       for(int element:hash){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
               count++;
            }
        }
        System.out.println(element + " : "+ count);
       }
       
    }
    public static void main(String[] args){
       int[] arr={2,3,2,3,4,5,6,6};
       frquency(arr);
    }
}