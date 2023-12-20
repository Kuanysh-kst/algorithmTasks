package bahagvara.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        int num1 = 323449;
        System.out.println("Sum of numbers: " + sumOfNumbers(num1));
    }

    private static int sumOfNumbers(int num) {
        if (num == 0) {
            return num;
        }
        return num % 10 + sumOfNumbers(num / 10);
    }

}
