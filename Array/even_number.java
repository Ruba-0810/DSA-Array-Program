import java.util.*;
class p1{
    //create method which want to written array so i create int[]
    public static int[] getArray(int a,int b){
    // create array
    int[] arr=new int[evenCount(a,b)];
    //index create to store value
    int index=0;
    for(int i=a;i<=b;i++){
        if(i%2==0){
           arr[index]= i;
           index++;
        }
    }
     return arr;
    }
    // to count even number
    public static int evenCount(int a,int b){
        int count=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        int a=10;
        int b=20;
        int[] array=getArray(a,b);
        System.out.println(Arrays.toString(array));// if we not writting Arrays.toString() it only give address of array [with means [I@345965f2]
    }
}