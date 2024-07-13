//with hash tech
import java.util.*;
class p1{
    public static int[] repeat_hash(int[] arr,int n){


       int[] hash=new int[n+1];//6+1[0 0 0 0 0 0 0]
       for(int i=0;i<n;i++){
           hash[arr[i]]=hash[arr[i]]+1;
       }
       int repeat=-1;
       int missing=-1;
       for(int i=1;i<hash.length;i++){
        if(hash[i]==0){
            missing=i;
        }
        if(hash[i]==2){
            repeat=i;
        }
       }
       int[] ans={repeat,missing};
       return ans;
    }
    public static void main(String [] args){
        int[] arr={1,2,3,4,2,6};
        int n=arr.length;
        int[] result=repeat_hash(arr,n);
        System.out.println(Arrays.toString(result));
    }
}