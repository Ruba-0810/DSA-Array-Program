/*
BETTER SOLUTION
Sample Input 1:
8
7 5 2 11 2 43 1 1
2
Sample Output 1:
2 11 2 43 1 1 7 5
*/
import java.util.*;
class p1{
  public static int[] leftRotation(int[] arr,int d){
    int n=arr.length;
     int[] temp=new int[d];
     for(int i=0;i<d;i++){
      temp[i]=arr[i];
     }
     for(int i=d;i<n;i++){
      arr[i-d]=arr[i];
     }
     for(int i=0;i<temp.length;i++){
      arr[n-d+i]=temp[i];
     }
   return arr;
  }
  public static void main(String [] args){
    int[] arr={7,5, 2, 11, 2, 43, 1, 1};
    int d=2;
    int[] result=leftRotation(arr,d);
    System.out.println(Arrays.toString(result));
  }
}
