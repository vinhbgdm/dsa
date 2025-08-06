package sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n){
            if (i1 < a1.length && i2 < a2.length){
                if (a1[i1] <= a2[i2]){
                    result[i] = a1[i1];
                    i++; i1++;
                } else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            } else {
                if(i1 < a1.length){
                    result[i] = a1[i1];
                    i++; i1++;
                } else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }
    public static int[] mergeSort(int[] a, int L, int R) {
        // TH dac biet
        if (L > R)  return new int[0];
        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }
        // TH tong quat
        // Chia ra
        System.out.println("Chia " + L + " - " + R);
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);

        // Tron vao: a1 và a2 la cac mang da sap xep
        int[] result = merge(a1, a2);
        System.out.println("Ket qua merge: " + Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6,8,10};
        int[] a3 = {1, 4, 9, 12, 19, 25, 31, 46, 50, 57, 72};
        System.out.println(Arrays.toString(merge(a1, a2)));
        System.out.println(Arrays.toString(mergeSort(a3, 0, a3.length - 1)));
    }
}
