/*
USING LINKEDHASHSET WITHOUT SORTING
Example 1:
INPUT=[2,3,4,2,3,31,3,4,5]
OUTPUT=[2,3,4,31,5]
 */
import java.util.*;
class p1{
    public static LinkedHashSet<Integer> linkedHashsetWitnoutSorting(int[] arr,int n){
        LinkedHashSet<Integer> ans=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,2,3,31,3,4,5};
        int n=arr.length;
        System.out.println(linkedHashsetWitnoutSorting(arr,n));
    }
}