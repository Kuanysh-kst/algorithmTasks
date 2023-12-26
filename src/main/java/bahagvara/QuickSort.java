package bahagvara;

import helper.TimeMillis;

import java.util.Arrays;

public class QuickSort {

    //1.Найти опорный элемент
    //2.Делать замену если элемент правой части меньше опорного или элемент правой части больше опорного
    //3.Вызываю рекурсивно метод для левой и правой части

    public static void main(String[] args) {
        long startTime = TimeMillis.startTime();
        int[] arr = {1, 2, 3, 6, 4, 3, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        TimeMillis.endTime(startTime);
    }

    private static void quickSort(int[] arr, int left, int right) {
        int index;

        if (arr.length > 1) {
            index = partition(arr, left, right);

            if (left < index - 1) {
                quickSort(arr, left, index - 1);
            }

            if (right > index) {
                quickSort(arr, index, right);
            }
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
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
//    private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
//
//        int pivot = arr[(rightIndex + leftIndex) / 2];
//
//        //делаю каретки
//        int leftMarkerIndex = leftIndex;
//        int rightMarkerIndex = rightIndex;
//
//        while (leftMarkerIndex <= rightMarkerIndex) {
//            while (arr[leftMarkerIndex] < pivot) {
//                leftMarkerIndex++;
//            }
//
//            while (arr[rightMarkerIndex] > pivot) {
//                rightMarkerIndex--;
//            }
//
//            if (leftMarkerIndex <= rightMarkerIndex) {
//                int swap = arr[leftMarkerIndex];
//                arr[leftMarkerIndex] = arr[rightMarkerIndex];
//                arr[rightMarkerIndex] = swap;
//                leftMarkerIndex++;
//                rightMarkerIndex--;
//            }
//
//            if (leftIndex < rightMarkerIndex) {
//                quickSort(arr,leftIndex,rightMarkerIndex);
//            }
//            if (rightIndex > leftMarkerIndex) {
//                quickSort(arr,leftMarkerIndex,rightIndex);
//            }
//        }
//    }
}
