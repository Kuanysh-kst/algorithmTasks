package bahagvara.recursion;

public class FromOneToN {
    public static void main(String[] args) {
        System.out.println("From 1 to n: ");
        counter(13000);
    }

    private static int counter(int n) {
        if (n == 1) {
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        return counter(n - 1);
    }
}
