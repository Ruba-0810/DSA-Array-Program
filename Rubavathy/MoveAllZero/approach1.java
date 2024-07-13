/*
Move all Zeros to the end of the array
Example 1:
Input:
 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output:
 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

 [USING ARRAYLIST ]
*/
import java.util.*;
class p1{
    public static void MoveAllZeroArrayList(int[] arr,int n){
        //arraylist use to collection zero i can also use array but we didnt know what is size so I'm go with arraylist
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        int N=list.size();
        for(int i=0;i<N;i++){
            arr[i]=list.get(i);
        }
        for(int i=N;i<n;i++){
            arr[i]=0;
        }
       return;
    }
    public static void main(String[]args){
        int[] arr={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n=arr.length;
        MoveAllZeroArrayList(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}