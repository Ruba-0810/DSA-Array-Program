/*
USING LINKEDHASHSET AND ARRAY IS SORTED
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3]
 */
import java.util.*;
class p1{
    public static LinkedHashSet<Integer> linkedHashRemove(int[] arr,int n){
        LinkedHashSet<Integer> array=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            array.add(arr[i]);
        }
        return array;
    }
    public static void main(String[] args){
        int[]arr={1,1,2,2,2,3,3};
        int n=arr.length;
        linkedHashRemove(arr,n);
        System.out.println(linkedHashRemove(arr,n));
    }
}