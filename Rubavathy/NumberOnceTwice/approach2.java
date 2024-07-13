/*
USING HASHMAP
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
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=map.getOrDefault(arr[i],0)+1;
            map.put(arr[i],count);
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()==1){
                     return it.getKey();
            }
          }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={4,4,1,2,1,2,2,5};
        System.out.println(numberTwice(arr));
    }
}