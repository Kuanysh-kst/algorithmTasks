package easy;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        int num1 = 45;
        System.out.println(climbStairs(num1));
        int num2 = 3;
        System.out.println(climbStairs(num2));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n];
    }
}
