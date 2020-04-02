package com.cick;

import java.math.BigDecimal;
import java.util.*;

public class BigDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, 0, n, new Comparator<Object>() {
            @Override
            public int compare(Object arr_1, Object arr_2) {
                BigDecimal number = new BigDecimal(arr_1.toString());
                BigDecimal number_2 = new BigDecimal(arr_2.toString());
                return number_2.compareTo(number);
            }
        });
        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}