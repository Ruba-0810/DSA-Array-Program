/*
USING HASHSET AND ARRAY IS SORTED
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3]
 */
import java.util.*;
class p1{
    public static HashSet<Integer> hahsetremoveDuplicate(int[] arr,int n){
        HashSet<Integer>hash=new HashSet<>();
        for(int i=0;i<n;i++){
            hash.add(arr[i]);
        }
        return hash;
    }
    public static void main (String[] args){
        int[] arr={1,1,2,2,2,3,3};
        int n=arr.length;
        System.out.println(hashsetremoveDuplicate(arr,n));

    }
}