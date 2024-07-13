/*
right Rotate the Array by One
Input:
 N = 5, array[] = {1,2,3,4,5}
Output:
 5,1,2,3,4
 */
import java.util.*;
class p1{
    public static int[] rightRotation(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=rightRotation(arr);
        System.out.println(Arrays.toString(result));
    }
}