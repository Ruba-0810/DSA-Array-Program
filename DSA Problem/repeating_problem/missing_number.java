import java.util.*;
class p1{
    public static int repeat(int[] arr,int n){
        int s2=(n*(n+1))/2;
        int s1=0;
        for(int i=0;i<arr.length;i++){
        s1=s1+arr[i];
       }
       return s2-s1;
    }
    public static void main (String [] args){
        int[] arr={1,2,5,4};
        int n=arr.length+1;
        int  ans=repeat(arr,n);
        System.out.println(ans);
    }
}