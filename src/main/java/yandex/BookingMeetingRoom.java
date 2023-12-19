package yandex;

import java.util.Scanner;

public class BookingMeetingRoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = scan.nextInt();
            intervals[i][1] = scan.nextInt();
        }

        System.out.println(book(intervals));
    }

    public static int book(int[][] segments) {
        int count = 0;
        int index = 0;

        for (int i = 0; i < segments.length - 1; i++) {
            int temp = 1;
            for (int j = 1; j < segments.length; j++) {
                int start = segments[j][0];
                int end = segments[index][1];

                if (end < start) {
                    index = j;
                    temp++;
                }
            }

            index = i + 1;
            count = Math.max(count, temp);
        }
        return count;
    }
}
