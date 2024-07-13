import java.util.*;
class p1{
    public static int[] repeatMath(int[] arr,int n){
        int n1=(n*(n+1)/2);
        int n2=(n*(n+1)*(2*n+1))/6;
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++){
             s1=s1+arr[i];
            s2=s2+(arr[i]*arr[i]);
        }
        int var1=s1-n1;//x-y
        int var2=s2-n2;//x2-y2

        var2=var2/var1;
        int x=(var1+var2)/2;
        int y=x-var1;
        
        int[] result={x,y};

        return result;

    }
    public static void main(String [] args){
       int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};
       int n=arr.length;
       int[] Final=repeatMath(arr,n);
       System.out.println(Arrays.toString(Final));
    }
}