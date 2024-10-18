package Sorting;

public class Quick_Sort {

    public int[] quick_Sort(int[] array, int low, int high) {
        if (low < high) {
            int partition = partition(array, high, low);
            quick_Sort(array, low, partition - 1);
            quick_Sort(array, partition + 1, high);
        }

        return new int[array.length];
    }

    private int partition(int[] array, int high, int low) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // have to swap array[j] to array[i]
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 10, 8, 7, -9999};
        Quick_Sort q1 = new Quick_Sort();
        q1.print(arr);
        q1.quick_Sort(arr, 0, arr.length - 1); // Corrected parameters order
        q1.print(arr);
    }
}
