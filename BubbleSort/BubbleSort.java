package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {
            int[] num = {2, 4, 5, 6, 1, 0, 6};
            bubble(num);
            System.out.println(Arrays.toString(num));
        }

        static void bubble(int[] num){
            boolean swapped;
            for (int i = 0; i < num.length; i++) {
                swapped = false;
                for (int j = 1; j < num.length - 1; j++) {
                    if (num[j] < num[j - 1]) {
                        int temp = num[j];
                        num[j] = num[j - 1];
                        num[j - 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
            }
        }
    }


