/*
USING LINKEDHASHSET
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3]
 */
import java.util.*;
class p1{
    public static LinkedHashSet<Integer> linkedHashSetRemoveDuplicate(int[] arr,int n){
        LinkedHashSet<Integer> list=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,2,3,3};
        int n=arr.length;
        System.out.println(linkedHashSetRemoveDuplicate(arr,n));
    }
}