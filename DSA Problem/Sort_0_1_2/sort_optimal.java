import java.util.*;
class p1{
    public static void swap(int[] arr,int low,int mid){
        int temp=arr[low];
        arr[low]=arr[mid];
        arr[mid]=temp;
    }
    public static int[] sortingOptimal(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
           if(arr[mid]==0){
            swap(arr,low,mid);
            low++;
            mid++;
           } 
           else if(arr[mid]==1){
            mid++;
           }else{
            swap(arr,mid,high);
            high--;
           }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
       // int[] arr={1,1,0,2,0,1,2,2,0};
        int n=arr.length;
        int[] result=sortingOptimal(arr,n);
        System.out.println(Arrays.toString((result)));
    }
}