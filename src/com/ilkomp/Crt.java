package com.ilkomp;

public class Crt {
    public static void main(String[] args) {
        // remainders
        int rem[] = { 2, 4, 5 };
        // modulos
        int mod[] = { 5, 11, 13 };
        // cetak hasil
        System.out.println("x = " + solve_x(rem, mod));
    }

    public static int find_gcd(int a, int b) {
        if (a == 0)
            return b;
        return find_gcd(b % a, a);
    }

    public static int find_inverse(int m, int n) {
        if (find_gcd(m, n) != 1)
            return -1;

        int r_0 = m > n ? m : n;
        int r_1 = r_0 == m ? n : m;
        int min = Math.min(m, n);
        int t_0 = 1;
        int t_1 = 0;

        while (r_1 != 0) {
            int q = r_0 / r_1;

            int tk = t_0 - q * t_1;
            t_0 = t_1;
            t_1 = tk;

            int temp = r_0 % r_1;
            r_0 = r_1;
            r_1 = temp;
        }
        return t_0 < 0 ? (t_0 + min) : t_0;
    }

    public static boolean is_co_prime(int mod[]) {
        for (int i = 0; i < mod.length - 1; i++) {
            for (int j = i + 1; j < mod.length; j++) {
                if (find_gcd(mod[i], mod[j]) != 1)
                    return false;
            }
        }
        return true;
    }

    public static int solve_x(int rem[], int mod[]) {
        if (!is_co_prime(mod))
            return -1;

        int n = 1;

        for (int i : mod) {
            n *= i;
        }

        int y[] = new int[rem.length];

        for (int i = 0; i < y.length; i++) {
            y[i] = n / mod[i];
        }

        int z[] = new int[rem.length];

        for (int i = 0; i < z.length; i++) {
            z[i] = find_inverse(mod[i], y[i]) % mod[i];
        }

        int sum = 0;

        for (int i = 0; i < rem.length; i++) {
            sum = sum + (rem[i] * y[i] * z[i]);
        }

        return sum % n;

    }
}
