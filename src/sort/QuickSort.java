package sort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] a, int L, int R) {
        // dieu kien dung
        if (L >= R) return;
        // B1: chọn khoa
        int key = a[(L + R) / 2];
        // B2: phan bo lai mang
        int k = partition(a, L, R, key);
        System.out.println("L=" + L + " R=" + R + " key=" + key + " k=" + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
        System.out.println("========================");
        // B3: chia doi mang & lap lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }

    // return pivot value
    public static int partition(int[] a, int L, int R, int key) {
        int iL = L, iR = R;
        while (iL <= iR) {
            // voi iL, di tim phan tu >= key de doi cho;
            while (a[iL] < key) iL++;
            // voi iR, di tim phan tu <= key de doi cho
            while (a[iR] > key) iR--;
            // doi vi tri 2 phan tu khong dung vi tri
            if (iL <= iR) {
                int tmp = a[iL];
                a[iL] = a[iR];
                a[iR] = tmp;
                iL++; iR--;
            }
        }
        return iL;
    }
    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 5, 4, 1, 2, 3 };
        quickSort(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
