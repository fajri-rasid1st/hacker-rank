package com.cick;

import java.util.*;

public class StaticInitializerBlock {

    static boolean flag = true;
    static int B, H;
    static {
        Scanner userInput = new Scanner(System.in);
        B = userInput.nextInt();
        H = userInput.nextInt();
        userInput.close();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}