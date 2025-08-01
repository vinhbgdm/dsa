package array;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int rows = accounts.length;
        int cols = accounts[0].length;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] nums1 = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(nums1));
    }
}
