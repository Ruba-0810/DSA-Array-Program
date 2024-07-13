/*
USING HASHSET
INPUT=[2,3,4,2,3,31,3,4,5]
OUTPUT=[2,3,4,5,31]
*/
import java.util.*;
class p1{
    public static HashSet removeDuplicate(int[] arr,int n){
      HashSet<Integer>hash=new HashSet<>();
      for(int i=0;i<n;i++){
        hash.add(arr[i]);
      }
      return hash;
    }
    public static void main(String [] args){
        int[] arr={2,3,4,5,3,31,3,4,5};
        int n=arr.length;
      
        System.out.println( removeDuplicate(arr,n));
    }
}
