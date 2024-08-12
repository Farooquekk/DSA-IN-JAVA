package Sorting_2D_Array;

import java.util.Arrays;

public class Sort_Each_Row_Individually {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort2DArray(int[][] arr) {
        for(int [] array : arr){
            bubbleSort(array);
        }
        /*for (int i = 0; i < arr.length; i++) {
            bubbleSort(arr[i]);
        }*/
    }

    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {3, 2, 1}, {4, 5, 6}, {9, 8, 7} };
        System.out.println("Printing Before Sorting : ");
        print2DArray(arr);
        sort2DArray(arr);
        System.out.println("Printing After Sorting : ");
        print2DArray(arr);
    }
}

