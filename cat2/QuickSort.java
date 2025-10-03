package cat2;

public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // find first elmemnt greater than pivot
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            // find first element smaller than pivot
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            // swap
            if (i < j) {
                swap(arr, i, j);
            }
            // do until u cross middle
        }
        // j is correct position
        swap(arr, low, j);
        return j;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 99, -1, -2};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
