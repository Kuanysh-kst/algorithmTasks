package bahagvara.recursion;

public class ExactDegree {
    public static void main(String[] args) {
        int num1 = 64;

        System.out.println("The exact degree of the number 2 :" + foo(num1));
    }

    private static String foo(int num) {
        if (num == 2) {
            return "Yes";
        }

        if (num%2 == 0 ) {
            return foo(num/2);
        }else {
            return "NO";
        }
    }
}
