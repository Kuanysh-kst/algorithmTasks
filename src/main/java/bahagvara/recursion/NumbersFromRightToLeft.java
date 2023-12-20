package bahagvara.recursion;

public class NumbersFromRightToLeft {
    public static void main(String[] args) {
        int num1 = 32222;
        foo(num1);
    }

    private static int foo(int num) {
        if (num / 10 == 0) {
            System.out.println(num % 10);
            return num;
        }
        System.out.println(num % 10);
        return foo(num / 10);
    }
}
