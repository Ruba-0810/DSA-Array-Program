package Array;

import java.util.Arrays;

public class reverse {

    static void reverse(int[]num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
    }
        static void swap(int[]num,int i,int j){
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;

        }
    public static void main(String[] args) {
        int[]num={1,9,5,37,50,29};
       reverse(num);
        System.out.println(Arrays.toString(num));


    }
}
