package bahagvara.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial is : " + factorial(6));
    }

    private static int factorial(int num) {
        if (num == 1) {
            return num;
        }

        return factorial(num - 1) * num;
    }
}
