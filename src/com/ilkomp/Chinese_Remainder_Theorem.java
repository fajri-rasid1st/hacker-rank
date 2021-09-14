package com.ilkomp;

import java.util.*;

public class Chinese_Remainder_Theorem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input banyak x : ");
        int banyak = sc.nextInt();
        int a_i[] = new int[banyak];
        int m_i[] = new int[banyak];
        int p_i[] = new int[banyak];
        int q_i[] = new int[banyak];
        int temp = 0;

        System.out.println("Input nilai ai : ");
        for (int i = 0; i < a_i.length; i++) {
            a_i[i] = sc.nextInt();
        }

        System.out.println("Input nilai mod dari setiap bi :");
        for (int i = 0; i < m_i.length; i++) {
            m_i[i] = sc.nextInt();
        }

        int big_m = m_i[0];

        for (int i = 1; i < m_i.length; i++) {
            big_m *= m_i[i];
        }

        for (int i = 0; i < p_i.length; i++) {
            p_i[i] = big_m / m_i[i];
        }

        for (int i = 0; i < q_i.length; i++) {
            temp = p_i[i] % m_i[i];
            int j = 0;
            while (true) {
                if ((temp * j) % m_i[i] == 1) {
                    q_i[i] = j;
                    break;
                }
                j++;
            }
        }

        int sum = 0;

        for (int i = 0; i < q_i.length; i++) {
            sum += q_i[i] * p_i[i] * a_i[i];
        }

        System.out.println(sum % big_m);

        sc.close();
    }
}
