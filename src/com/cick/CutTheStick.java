package com.cick;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheStick {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());
        int[] arr = new int [n];
        int[] sortingArr = new int [n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = userInput.nextInt();
        }
        Arrays.sort(arr);

        int idx = 0;
        for (int j = arr.length-1 ; j >= 0 ; j--) {
            sortingArr[idx] = arr[j];
            idx++;
        }

        int ret = 1;
        for (int i = 0 ; i < sortingArr.length - 1 ; i++) {
            if (sortingArr[i] == sortingArr[i+1]) {
                ret++;
            }
        }
        if (ret == sortingArr.length) {
            System.out.println(ret);
            userInput.close();
            return;
        }
        
        getLastSticks(sortingArr);
        userInput.close();
    }
    public static void getLastSticks(int[] sortingArr) {
        int total = sortingArr.length;
        boolean conditon = true;
        while (conditon) {
                System.out.println(total);
            for (int j = 0 ; j < sortingArr.length ; j++) {
                int idx = 1;
                while (sortingArr[sortingArr.length - idx] == 0) {
                    idx++;
                    if (sortingArr[sortingArr.length - idx] != 0 || idx == sortingArr.length) {
                        break;
                    }
                }
                if (sortingArr[j] == 0) {
                    continue;
                }
                sortingArr[j] = sortingArr[j] - sortingArr[sortingArr.length - idx];
                if (sortingArr[j] == 0) {
                    total--;
                }
            }
            if (total == 1) {
                System.out.println(total);
                conditon = false;
            }else {
                int reseveTotal = 1;
                for (int i = 0 ; i < sortingArr.length-1 ; i++) {
                    if (sortingArr[i] == sortingArr[i+1]) {
                        reseveTotal++;
                    }else {
                        break;
                    }
                }
                if (reseveTotal >= total) {
                    System.out.println(reseveTotal);
                    conditon = false;
                }
            }
        }
    }
}