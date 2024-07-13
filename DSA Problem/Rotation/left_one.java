/*
Left Rotate the Array by One
Input:
 N = 5, array[] = {1,2,3,4,5}
Output:
 2,3,4,5,1
 */
import java.util.*;
class p1{
    public static int[] leftRotation(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int length=sc.nextInt();
          System.out.print("Give the array in sorted order:");
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
        int[] result=leftRotation(arr);
        System.out.println(Arrays.toString(result));

    }
}