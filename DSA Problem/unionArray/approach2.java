/*
/*
USING HASHMAP
Example 1:
Input:

n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:

 {1,2,3,4,5}
*/
import java.util.*;
class p1{
    public static ArrayList<Integer>unionArray(int[] arr1,int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hash.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hash.add(arr2[i]);
        }
        for(int i:hash){
            list.add(i);
        }
        return list;
    } 
    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[] arr2={1,2,3,4,5};
        ArrayList<Integer> result=unionArray(arr1,arr2);
        System.out.println(result);
    }
}