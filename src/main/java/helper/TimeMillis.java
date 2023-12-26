package helper;

public class TimeMillis {
    public static long startTime() {
        // Зафиксировать время начала выполнения алгоритма
        return System.currentTimeMillis(); // или System.nanoTime();
    }
    public static void endTime(long startTime) {
        // Зафиксировать время завершения выполнения алгоритма
        long endTime = System.currentTimeMillis(); // или System.nanoTime();

        // Вычислить время выполнения
        long elapsedTime = endTime - startTime;

        // Вывести результат
        System.out.println("Алгоритм выполнился за " + elapsedTime + " миллисекунд");
    }
}
