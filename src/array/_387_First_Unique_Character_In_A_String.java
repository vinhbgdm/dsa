package array;

public class _387_First_Unique_Character_In_A_String {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            count[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int)c;
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
