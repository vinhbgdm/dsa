package array;

public class _27_Remove_Element_Normal {
    public static int removeElementNormal(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;) {
            if(nums[i] == val){
                for(int j = i; j <= n - 2; j++){
                    nums[j] = nums[j+1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        System.out.println(removeElementNormal(nums1, 2));

        int[] nums2 = {3,2,2,3,4,6};
        System.out.println(removeElement(nums2, 6));
    }
}
