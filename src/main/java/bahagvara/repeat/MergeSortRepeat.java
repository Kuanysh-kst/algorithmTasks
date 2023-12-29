package bahagvara.repeat;

import helper.TimeMillis;

import java.util.Arrays;


public class MergeSortRepeat {
    //1.Нужно разделить массив на подмассивы до количества в одни элемент, все это делать рекурсивно.
    //2.Нужно собирать подмассивы в массивы, сравнивая элемнты двух составных массивов, чтобы сделать это одним массивом.
    public static void main(String[] args) {
        long startTime = TimeMillis.startTime();
        int[] arr = {1,20000000,-3,-323, 33, 45, 56, 43, 3, 200, 40, 34};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        TimeMillis.endTime(startTime);
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return;
        }

        int middle = n / 2;
        int[] l = new int[middle];
        int[] r = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            l[i] = arr[i];
        }
        for (int i = middle; i < n; i++) {
            r[i - middle] = arr[i];
        }

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int index = 0;
        int ll = 0;
        int rr = 0;

        while (ll < l.length && rr < r.length) {
            if (l[ll] < r[rr]) {
                arr[index++] = l[ll++];
            } else {
                arr[index++] = r[rr++];
            }
        }

        for (int i = ll; i < l.length; i++) {
            arr[index++] = l[i];
        }

        for (int i = rr; i < r.length; i++) {
            arr[index++] = r[i];
        }
    }
}
