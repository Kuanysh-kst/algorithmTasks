package easy;

public class Sqrt69 {
    public static void main(String[] args) {
        int num1 = 64;
        System.out.println(mySqrt(num1));
        int num2 = 8;
        System.out.println(mySqrt(num2));
        int num3 = 81;
        System.out.println(mySqrt(num3));
    }

    public static int mySqrt(int x) {
        int r = x;
        int l = 1;
        while (r >= l) {
            int mid = (r + l) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (mid > x / mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
