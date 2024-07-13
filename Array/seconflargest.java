package Array;

public class seconflargest {

        static void max(int[] num) {
            int maxvalue1 = num[0]; // Initialize maxvalue1 with the first element
            int maxvalue2 = num[0]; // Initialize maxvalue2 with the first element

            for (int i = 1; i < num.length; i++) {
                if (num[i] > maxvalue1) {
                    maxvalue2 = maxvalue1; // Move the current maxvalue1 to maxvalue2
                    maxvalue1 = num[i]; // Update maxvalue1 to the current element
                } else if (num[i] > maxvalue2 && num[i] < maxvalue1) {
                    maxvalue2 = num[i]; // Update maxvalue2 to the current element
                }
            }

            System.out.println("Max Value 1: " + maxvalue1);
            System.out.println("Max Value 2: " + maxvalue2);
        }

        public static void main(String[] args) {
            int[] num = {2, 1, 4, 3, 5, 6, 7};
            max(num);
        }
    }

