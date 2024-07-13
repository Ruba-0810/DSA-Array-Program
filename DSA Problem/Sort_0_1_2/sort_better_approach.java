import java.util.*;
class p1{
    public static int[] sorting(int[] arr,int n){
        int[] ans=new int[n];
        int count1=0,count2=0,count3=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count1++;
            }else if(arr[i]==1){
                count2++;
            }else{
                count3++;
            }
        }
        for(int i=0;i<count1;i++){
           ans[i]=0;
        }
        for(int i=count1;i<count1+count2;i++){
            ans[i]=1;
        }
        for(int i=count1+count2;i<n;i++){
            ans[i]=2;
        }
        return ans;
    }
    public static void main(String []args){
        int[] arr={0,2,1,1,2,0,0};
        int n=arr.length;
       int[] ans= sorting(arr,n);
       System.out.println(Arrays.toString(ans));
    }
}