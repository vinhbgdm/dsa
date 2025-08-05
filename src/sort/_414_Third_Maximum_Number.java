package sort;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] a) {
        long[] maxArr = {Long.MIN_VALUE, Long.MAX_VALUE, Long.MIN_VALUE};
        for (int i = 0; i < a.length; i++) {
            insert(maxArr, a[i]);
        }
        if (maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        }
        return (int) maxArr[2];
    }

    private static void insert(long[] maxArr, int val) {
        int i = 0;
        while (i < maxArr.length) {
            if (maxArr[i] == val) return;
            else if (maxArr[i] < val) break;
            else i++;
        }
        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 64, 25, 25, 90};
        System.out.println(thirdMax(arr));
    }
}
