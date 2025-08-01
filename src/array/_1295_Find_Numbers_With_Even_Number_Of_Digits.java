package array;

public class _1295_Find_Numbers_With_Even_Number_Of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(countNumber(i) % 2 == 0) count++;
        }
        return count;
    }

    private static int countNumber(int a) {
        int count = 0;
        int kq = a;
        while(kq != 0){
            kq = a / 10;
            a = kq;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}


