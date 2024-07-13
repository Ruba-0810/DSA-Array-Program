//without using hashing
import java.util.*;
class p1{
    public static int[] repeat_missing(int[] arr,int n){
        int repeat=-1;
        int missing=-1;
        for(int i=1;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    count=count+1;
                }
            }
                if(count==2){
                    repeat=i;
                }
                else if(count==0){
                    missing=i;
                }
                if(repeat!=-1 && missing!=-1){
                    break;
                }
        }
        int[] ans={repeat,missing};
        return ans;
    }
    public static void main(String[] args){
         int[] arr={1,2,4,5,6,2,7};
         int n=arr.length;
         int[] Final=repeat_missing(arr,n);
         System.out.println(Arrays.toString(Final));
    }
}