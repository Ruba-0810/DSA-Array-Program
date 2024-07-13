/*
USING NORMAL WITHOUT SORTING
Example 1:
INPUT=[2,3,4,2,3,31,3,4,5]
OUTPUT=[2,3,4,31,5]
 */
import java.util.*;
class p1{
    public static int[] removeNormalMethod(int[] arr,int n){
        int[] temp=new int[n];
        temp[0]=arr[0];
        int k=1;
        for(int i=1;i<n;i++){
            // if arr and temp of elenment is same then break
            int j=0;
            for(;j<k;j++){//134
                if(arr[i]==temp[j]){
                    break;
                }
            }

            if(j==k){
                temp[k]=arr[i];
                k++;
            }
        }
       //[2,3,4,31,5.0.0]
       //trim
       int[] ans=new int[k];
       for(int i=0;i<k;i++){
           ans[i]=temp[i];
       }
       return ans;

    }
    public static void main(String[] args){
        int[] arr={2,3,4,2,3,31,3,4,5};
        int n=arr.length;
        int[] result=removeNormalMethod(arr,n);
        System.out.println(Arrays.toString(result));
    }
}