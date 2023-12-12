package easy;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, nums1.length -3, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1};
        int[] nums4 = {};

        merge(nums3, nums3.length, nums4, nums4.length);
        System.out.println(Arrays.toString(nums3));

        int[] nums5 = {0};
        int[] nums6 = {1};
        merge(nums5, nums5.length, nums6, nums6.length);
        System.out.println(Arrays.toString(nums5));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 || n == 0 ) {
            return;
        }
        int hightN = n - 1;
        int hightM = m - 1;

        while (hightN >= 0) {
            if (nums2[hightN] > nums1[hightM]) {
                nums1[hightM] = nums2[hightN];
                hightN --;
                hightM --;
            }
        }
        Arrays.sort(nums1);
    }

}
