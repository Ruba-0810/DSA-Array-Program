package MergeSort;

import java.util.Arrays;

public class RecursiveMerge {
    public static void main(String[] args) {
         int[]num={8,3,4,1,2,5,6,7};
        num=mergefunction(num);
        System.out.println(Arrays.toString(num));
    }
    static int[] mergefunction(int[]num){
        if(num.length==1){
            return num;
        }
        int mid=num.length/2;
        int[]left=mergefunction(Arrays.copyOfRange(num,0,mid));
        int[]right=mergefunction(Arrays.copyOfRange(num,mid,num.length));

        return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {
        //now we create object
        int[] mix=new int[first.length+second.length];  //k object
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length&&j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

}
