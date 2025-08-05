package dequy;

public class Fibonacci {
    static int[] F = new int[100];

    public static int Fibo(int n) {
        if (F[n] != 0) return F[n];
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibo(n - 1) + Fibo(n - 2);
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.Fibo(10));

        int[] Fibo = new int[100];
        Fibo[1] = 1;
        Fibo[2] = 2;
        for (int i = 3; i <= 10; i++) {
            Fibo[i] = Fibo(i - 1) + Fibo(i - 2);
        }
        System.out.println(Fibo[10]);
    }
}
