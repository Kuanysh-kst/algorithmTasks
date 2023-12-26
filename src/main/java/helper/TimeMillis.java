package helper;

public class TimeMillis {
    public static long startTime() {
        return System.currentTimeMillis(); // или System.nanoTime();
    }
    public static void endTime(long startTime) {
        long endTime = System.currentTimeMillis(); // или System.nanoTime();

        long elapsedTime = endTime - startTime;

        System.out.println("Алгоритм выполнился за " + elapsedTime + " миллисекунд");
    }
}
