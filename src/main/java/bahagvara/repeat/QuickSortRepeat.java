package bahagvara.repeat;

import helper.TimeMillis;

import java.util.Arrays;

public class QuickSortRepeat {
    //1.Для начала нужно найти опрный элемент pivot
    //2.Нужно менять местами элементы которые находятся не в свойх секциях
    //3.Нужно вызывать метод quickSort рекурсивно чтобы он делил массив на маленькие части
    public static void main(String[] args) {
        long startTime = TimeMillis.startTime();
        int[] arr = {1, 33, 45, 56, 43, 3, 200, 40, 34};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        TimeMillis.endTime(startTime);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (arr.length > 1) {
            int index = partition(arr, left, right);
            if (left < index - 1) {
                quickSort(arr, left, index - 1);
            }
            if (right > index) {
                quickSort(arr, index, right);
            }
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(right + left) / 2];
        while (left <= right) {
            while (pivot > arr[left]) {
                left++;
            }
            while (pivot < arr[right]) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

//    private static void quickSort(int[] arr, int left, int right) {
//        int pivot = arr[(left + right) / 2];
//        int leftMarker = left;
//        int rightMarker = right;
//
//        while (leftMarker <= rightMarker) {
//            while (pivot > arr[leftMarker]) {
//                leftMarker++;
//            }
//            while (pivot <arr[rightMarker]) {
//                rightMarker--;
//            }
//
//            if (leftMarker <= rightMarker) {
//                int temp = arr[leftMarker];
//                arr[leftMarker] = arr[rightMarker];
//                arr[rightMarker] = temp;
//                leftMarker++;
//                rightMarker--;
//            }
//        }
//
//        if (leftMarker < right) {
//            quickSort(arr,leftMarker,right);
//        }
//        if (rightMarker> left) {
//            quickSort(arr,left,rightMarker);
//        }
//
//    }
}
