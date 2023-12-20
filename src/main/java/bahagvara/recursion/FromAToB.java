package bahagvara.recursion;

public class FromAToB {
    public static void main(String[] args) {
        System.out.println("From A to B : ");
        counter(23, 3);
    }

    private static int counter(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return a;
        }

        if (a < b) {
            System.out.println(a);
            return counter(a + 1, b);
        } else {
            System.out.println(a);
            return counter(a - 1, b);
        }
    }
}
