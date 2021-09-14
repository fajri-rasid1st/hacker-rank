package com.ilkomp;

public class Euclid {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int result = fpb(sc.nextInt(), sc.nextInt());
        System.out.println(result);
        sc.close();
    }

    public static int fpb(int a, int b) {
        if (a == 0)
            return Math.abs(b);
        if (b == 0)
            return Math.abs(a);

        int r_0 = Math.max(Math.abs(a), Math.abs(b));
        int r_1 = Math.min(Math.abs(a), Math.abs(b));

        while (true) {
            int q = (int) Math.floor(r_0 / r_1);
            int r_k = r_0 - (q * r_1);
            if (r_k == 0) {
                break;
            }
            r_0 = r_1;
            r_1 = r_k;
        }
        return r_1;
    }
}
