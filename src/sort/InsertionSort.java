package sort;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        System.out.println("Sorted Array");
    }
}
