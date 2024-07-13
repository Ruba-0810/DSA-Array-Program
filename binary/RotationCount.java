package binary;

public class RotationCount {
    public static void main(String[] args) {

        int[] num = {4, 5, 6, 7, 8,9,10,0, 1, 2, 3};
        int result = count(num);
        System.out.println(result);
    }

    static int count(int[] num) {
        int pivot = pivotelementwithoutdupilicate(num);
        if (pivot == -1) {
            return 0;
        } else {
            return pivot + 1;
        }
    }

    static int pivotelementwithoutdupilicate(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && num[mid] > num[mid + 1]) {
                return mid;
            }
            if (mid > start && num[mid] < num[mid - 1]) {
                return mid - 1;
            }
            if (num[start] > num[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int pivotelementwithduplicate(int[] num) {
        int start = 0;
        int end = num.length - 1;
        int mid = start + (end - start) / 2;
        if (mid < end && num[mid] > num[mid + 1]) {
            return mid;
        }
        if (mid > start && num[mid] < num[mid - 1]) {
            return mid - 1;
        }
        if (num[mid] == num[start] && num[mid] == num[end]) {
            if (num[start] > num[start + 1]) {
                return start;
            }
            start++;
            if (num[end] < num[end - 1]) {
                return end - 1;
            }
            end--;
        }
        return -1;
    }
}
//    static int binarysearch(int[]num){
//        int start=0;
//        int end= num.length-1;
//        int mid=start+(end-start)/2;
//        if(target>num[mid]){
//            start=mid+1;
//        }
//        else if(target<num[mid]){
//            end= mid-1;
//        }
//        else{
//            return mid;
//        }
//        return -1
//
//    }

