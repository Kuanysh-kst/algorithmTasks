package bahagvara;

import helper.TimeMillis;

import java.util.Arrays;

public class MergeSort {

    //1. Нужно поделить массив на подмассивы рекурсивно
    //2. Нужно сравнивать элемнты и добавлять их в основной массив
    public static void main(String[] args) {
        long startTime = TimeMillis.startTime();
        int[] arr = {1, 2, 3, 6, 4, 3, 5, 6};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        TimeMillis.endTime(startTime);
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l);
        mergeSort(r);
        merge(arr,l,r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[index++] = l[i++];
            } else {
                arr[index++] = r[j++];
            }
        }

        for (int ll = i; ll < left; ll++) {
            arr[index++] = l[ll];
        }

        for (int rr = j; rr < right; rr++) {
            arr[index++] = r[rr];
        }
    }


}
