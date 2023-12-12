package patterns;

public class SlidingWindowExample {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int windowSize = 3;//Window size

        //Traversing the array using a sliding window
        for (int i = 0; i <= data.length - windowSize; i++) {
            int sum = 0;

            //Calculating the sum of the elements  int the current window

            for (int j = i; j < i + windowSize; j++) {
                sum += data[j];
            }

            //Calculating of the average value and output of the result
            double result = (double) sum / windowSize;

            System.out.println("the average value is : " + result);
        }
    }
}
