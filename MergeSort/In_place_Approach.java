package MergeSort;

import java.util.Arrays;

public class In_place_Approach {
    public static void main(String[] args) {

        int[]num={5,4,3,2,1 };
        mergesort(num,0, num.length);
        System.out.println(Arrays.toString(num));

    }
    static void mergesort(int[]num,int start,int end){
        if(end-start==1){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(num,start,mid);
        mergesort(num,mid,end);
        searchmerge(num,start,mid,end);
    }
    private static void searchmerge(int[]num,int start,int mid,int end){
        int[]mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid&&j<end){
            if(num[i]<num[j]){
                mix[k]=num[i];
                i++;
            }
            else{
                mix[k]=num[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=num[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=num[j];
            j++;
            k++;
        }
        for(int l=0;l< mix.length;l++){
            num[start+l]=mix[l];
        }

    }
}
