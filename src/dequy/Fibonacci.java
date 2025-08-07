package dequy;

import java.util.Scanner;

public class Fibonacci {
    public static final int MAX = 100;

    public static int Fibo1(int n) {
        if(n <= 1) return n;
        return Fibo1(n - 1) + Fibo1(n - 2);
    }

    public static int Fibo2(int n) {
        int[] F = new int[100];
        if (F[n] != 0) return F[n];
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibo1(n - 1) + Fibo1(n - 2);
        return F[n];
    }

    public static int Fibo3(int n) {
        int[] F = new int[n + 1];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        long t0 = System.currentTimeMillis();

        int f1 = Fibo1(n);
        long t1 = System.currentTimeMillis();

        int f2 = Fibo2(n);
        long t2 = System.currentTimeMillis();

        int f3 = Fibo3(n);
        long t3 = System.currentTimeMillis();

        System.out.println("Fibo 1: " + f1 + " | time: " + (t1 - t0));
        System.out.println("Fibo 2: " + f2 + " | time: " + (t2 - t1));
        System.out.println("Fibo 3: " + f3 + " | time: " + (t3 - t2));
    }
}
