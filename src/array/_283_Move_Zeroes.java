package array;

import java.util.Arrays;

public class _283_Move_Zeroes {

    // O(n)
    public static void moveZeroes1(int[] nums) {
        int n = nums.length;
        int[] T = new int[n];
        int iT = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) T[iT++] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = T[i];
        }
    }

    // O(1)
    public static void moveZeroes2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        // Đặt các phần còn lại thành 0
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes1(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0, 2, 0, 4, 11};
        moveZeroes2(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
