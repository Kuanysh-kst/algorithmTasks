package easy;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) { 
        int low = 0;
        int hight = nums.length - 1;

        while (low <= hight) {
            int mid = (low + hight) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                hight = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
