package array;

public class _1662_Check_Two_String_Equivalent {
    public static boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();
        for (String s : arr1) {
            r1.append(s);
        }
        for (String s : arr2) {
            r2.append(s);
        }
        return r1.toString().equals(r2.toString());
    }
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"a", "b", "c"};
        if(arrayStringsAreEqual(arr1, arr2)){
            System.out.println("OK");
        }
    }
}
