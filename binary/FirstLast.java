package binary;

public class FirstLast {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private int search(int[] nums, int target, boolean firstStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;//2+1=3
                /*8,8,10
                mid=3+5/2=8/2=4
                start:4+5/2=9/2=5
                so next ||
                 */

            } else {
                ans = mid;//2
                if (firstStart) {
                    end = mid - 1;//1
                } else {
                    start = mid + 1;//
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        FirstLast firstLast = new FirstLast();  // Create an instance of the class
        int[] nums = { 8, 8,8,8, 10,11};
        int target = 8;
        int[] result = firstLast.searchRange(nums, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}