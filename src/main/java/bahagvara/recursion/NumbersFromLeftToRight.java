package bahagvara.recursion;

public class NumbersFromLeftToRight {
    public static void main(String[] args) {
        int num1 = 3222;
        System.out.println(foo(num1));
    }

    private static String foo(int num) {
        if (num / 10 == 0) {
            return Integer.toString(num);
        }
        return foo(num/10)+ " " + num%10;
    }
}
