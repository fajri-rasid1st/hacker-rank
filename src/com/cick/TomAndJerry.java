package com.cick;

public class TomAndJerry {

    static java.util.Scanner userInput = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        int q = userInput.nextInt();
        if (q < 1 || q > 100) {
            userInput.close();
            return;
        }
        String result = tomAndJerry(q);
        System.out.print(result);
        userInput.close();
    }
    public static String tomAndJerry(int query) {
        String result = "";
        for (int i = 0 ; i < query ; i++) {
            int x = userInput.nextInt();    //cat A
            int y = userInput.nextInt();    //cat B
            int z = userInput.nextInt();    //mouse C
            if (x > 100 || x < 1 || y > 100 || y < 1 || z > 100 || z < 1) {
                userInput.close();
                return result;
            }
            if (Math.abs(z-x) < Math.abs(z-y)) {
                if (i == query - 1) {
                    result += "cat A";
                }else {
                    result += "cat A\n";
                }
            }else if (Math.abs(z-x) > Math.abs(z-y)) {
                if (i == query - 1) {
                    result += "cat B";
                }else {
                    result += "cat B\n";
                }
            }else {
                if (i == query - 1) {
                    result += "mouse C";
                }else {
                    result += "mouse C\n";
                }
            }
        }
        return result;
    }
}