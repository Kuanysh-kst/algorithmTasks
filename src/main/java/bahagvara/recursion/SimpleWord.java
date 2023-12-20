package bahagvara.recursion;

public class SimpleWord {
    public static void main(String[] args) {
        int num1 = 284;
        System.out.println("Is it simple number?");
        System.out.println(foo(2,num1));
    }

    private static String foo(int divider, int num) {
        if (num == 2 || num == 1) {
            return "YES";
        }
        if (divider == num) {
            return "YES";
        }
        if (num % divider == 0) {
            return "NO";
        } else {
            return foo(divider + 1, num);
        }
    }
}
