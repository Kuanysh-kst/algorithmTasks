package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;

        System.out.println(Arrays.toString(twoSum(arr1, target1)));

        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(arr2, target2)));

        int[] arr3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(arr3, target3)));

        int[] arr4 = {-1, -2, -3, -4, -5};
        int target4 = -8;
        System.out.println(Arrays.toString(twoSum(arr4, target4)));
    }

//    public static int[] twoSum(int[] nums, int target) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            int component = target - nums[i];
//
//            if (map.containsKey(component) && i != map.get(component)) {
//                return new int[]{i, map.get(component)};
//            }
//        }
//        return new int[]{};
//    }

    public static int[] twoSum(int[] nums, int target) {
        int low = 0;
        int hight = nums.length - 1;

        while (low < hight) {
            int sum = nums[low] + nums[hight];

            if (sum == target) {
                return new int[]{low, hight};
            }else if (target > sum) {
                low++;
            }else {
                hight--;
            }
        }
        return new int[]{0};
    }
}
