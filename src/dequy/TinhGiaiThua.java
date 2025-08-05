package dequy;

public class TinhGiaiThua {
    public static int GiaiThua(int n){
        if(n == 0) return 1;
        return n * GiaiThua(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(GiaiThua(4));
    }
}
