package Recursion.Pattern;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 1};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr,int r,int c,int max) {
        if (r==0) {
            return;
        }
        if(c<r){
        if (arr[c] > arr[max]) {     //initialy c=0(index) and max=0(index)
            selection(arr, r, c + 1, c);
        } else {
            selection(arr, r, c + 1, max);
        }
    }
        else{
            int temp = arr[max];
            arr[max] = arr[r - 1];      //max element is place in r-1
            arr[r - 1] = temp;
            selection(arr,r-1,0,0);
        }
    }
    }
