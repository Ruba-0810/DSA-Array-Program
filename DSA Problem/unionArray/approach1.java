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
    public static ArrayList<Integer> unionArray(int[] arr1,int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            int count=hash.getOrDefault(arr1[i],0)+1;
            hash.put(arr1[i],count);
        }
        for(int i=0;i<arr2.length;i++){
            int count=hash.getOrDefault(arr2[i],0)+1;
            hash.put(arr2[i],count);
        }
        int N=hash.size();
        for(int i:hash.keySet()){
             list.add(i);
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,11};
        int[] arr2={2,3,4,4,5,6,7,8,9,10};
       ArrayList<Integer> ans=unionArray(arr1,arr2);
       System.out.println(ans);
    }
}