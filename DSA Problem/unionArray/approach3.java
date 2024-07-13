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
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                      list.add(arr1[i]);
                }
                i++;
            }else{
               if(list.size()==0||list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                    
               }
               j++;
            }
        }
        while(i<n){
            if(list.get(list.size()-1)!=arr1[i]){
                      list.add(arr1[i]);
                      i++;
           }
        }
         while(j<m){
            if(list.get(list.size()-1)!=arr2[j]){
                      list.add(arr1[j]);
                      j++;
            }
         }
        return list;
    }
    public static void main(String [] args){
        int[] arr1={1,2,3,6,9,10};
        int[] arr2={2,3,4,4,5};
        ArrayList<Integer> ans=unionArray(arr1,arr2);
        System.out.println(ans);
    }
}