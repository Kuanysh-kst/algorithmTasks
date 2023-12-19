package bahagvara;

public class Euclid {

    public static void main(String[] args) {
        System.out.println("Euclid with 24 and 32: " + euclid(24,32));
    }
    public static int euclid(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        return euclid(b, a % b);
    }
}
