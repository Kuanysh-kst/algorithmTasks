package easy;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && digits[0] + 1 == 10) {
                int[] arr = Arrays.copyOf(digits, digits.length + 1);
                arr[0] = 1;
                return arr;

            }
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}
