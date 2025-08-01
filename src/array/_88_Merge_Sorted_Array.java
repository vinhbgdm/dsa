package array;

public class _88_Merge_Sorted_Array {
    public static void mergeNormal(int[] nums1, int m, int[] nums2, int n) {
        for(int j : nums2){
            add(j, nums1, m);
            m++;
        }
    }

    private static void add(int x, int[] a, int m) {
        boolean check = false;
        for(int k = 0; k < m; k++){
            if(a[k] > x){
                check = true;
                for(int i = m -1; i >= k; i--){
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if(check == false){
            a[m] = x;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {
            if(i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if(j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {0,3,6};
        mergeNormal(nums1,4, nums2,3);
        merge(nums1,4, nums2,3);
        System.out.println("OK");
    }
}
