package dequy;

public class FindMax {
    public static int curMax = -1;

    public static void findmax1(int[] arr, int i) {
        if (i < arr.length) {
            if (arr[i] > curMax) {
                curMax = arr[i];
            }
            findmax1(arr, i + 1);
        }
    }

    public static int findMax2(int[] arr, int i, int previousMax) {
        if (i < arr.length) {
            int cusMax = Math.max(arr[i], previousMax);
            return findMax2(arr, i + 1, cusMax);
        }
        return previousMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        curMax = -1;
        findmax1(arr, 0);
        System.out.println(curMax);

        System.out.println(findMax2(arr, 0, -1));
    }
}
