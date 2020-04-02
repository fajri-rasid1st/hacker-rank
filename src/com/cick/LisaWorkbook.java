package com.cick;

import java.util.ArrayList;
import java.util.Scanner;

public class LisaWorkbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        LisaWorkbook lw = new LisaWorkbook();
        System.out.println(lw.getSpecialPage(arr, k));

        sc.close();
    }

    private int getSpecialPage(ArrayList<Integer> arr, int k) {
        int specialPage = 0;
        int page = 1;
        for (int i = 0; i < arr.size(); i++) {
            int j = 1;
            while (j <= arr.get(i)) {
                if (j == page) {
                    specialPage++;
                }
                if (j % k == 0 && j != arr.get(i)) {
                    page++;
                }
                j++;
            }
            page++;
        }
        return specialPage;
    }
}