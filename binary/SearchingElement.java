package binary;
                      //POSITION OF AN ELEMENT IN INFINITE SORTED ARRAY
public class SearchingElement {


    public static void main(String[] args) {

        int[] num = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17};
        int target = 16;
        int result = searching(num, target);
        System.out.println(result);
    }

    static int searching(int[] num, int target) {

        //here we take only two element
        int start = 0;
        int end = 1;

        //here taget is grater than end and we take double of 2=4
        while (target > num[end]) {
            int temp = end + 1;           //temp=indexofend+1==>1+1===>2
            end = end + (end - start) * 2;
            start = temp;
        }
        return binarysearch(num, target, start, end);
    }

    static int binarysearch(int[] num, int target, int start, int end) {
        while (start <= end) {
            int mid = end + (end - start) / 2;
            if (target > num[mid]) {
                start = end + 1;
            } else if (target < num[mid]) {
                end = end - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

