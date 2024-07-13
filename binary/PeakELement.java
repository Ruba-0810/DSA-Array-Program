package binary;





/*
class PeakElement {
    int search(int[] arr, int target) {
        int peak = peakelement(arr);
        int firsttry = firsthalf(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return firsthalf(arr, target, peak + 1, arr.length - 1);
    }

    static int peakelement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    //{8,7,6,5,1,2,3};
    public int firsthalf(int[] arr, int target, int start, int end) {
        boolean istrue;
        if (arr[start] < arr[end]) {
            istrue = true;

        } else {
            istrue = false;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (istrue) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 8, 9};
        int target = 5;
        PeakElement peakelement = new PeakElement();
        System.out.println(peakelement.search(arr,target));
    }
}

 */
public class PeakELement {
      public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 8, 9};
        int target = 5;
        int result=search(arr,target);
          System.out.println(result);

        }
        static int search ( int[] arr, int target){
            int peak = peakelement(arr);
            int firsttry = firsthalf(arr, target, 0, peak);
            if (firsttry != -1) {
                return firsttry;
            }
            return firsthalf(arr, target, peak + 1, arr.length - 1);
        }
        static int peakelement ( int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            return start;
        }
        //{8,7,6,5,1,2,3};
        static int firsthalf ( int[] arr, int target, int start, int end){
            boolean istrue;
            if (arr[start] < arr[end]) {
                istrue = true;

            } else {
                istrue = false;
            }

            while (start < end) {
                int mid = start + (end - start) / 2;
                if (istrue) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                }
            }
            return -1;

        }
    }



