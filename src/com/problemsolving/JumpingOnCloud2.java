package com.problemsolving;

public class JumpingOnCloud2 {
    public static void main(String[] args) {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = userInput.nextInt();
        }
        if (n == 2) {
            System.out.println(1);
            userInput.close();
            return;
        }

        JumpingOnCloud2 joc_2 = new JumpingOnCloud2();
        int result = joc_2.getTotalJump(c);
        System.out.println(result);

        userInput.close();
    }

    private int getTotalJump(int[] c) {
        int jumps = 0;
        if (c.length % 2 == 0 && c[c.length - 2] == 0) {
            jumps++;
            if (c[c.length - 3] == 0) {
                jumps--;
            }
        }
        for (int i = 0; i < c.length - 2; i++) {
            switch (c[i + 1]) {
                case 0:
                    if (c[i + 2] == 0) {
                        i++;
                        jumps++;
                    } else {
                        jumps++;
                    }
                    break;
                case 1:
                    i++;
                    jumps++;
                    break;
            }
        }
        return jumps;
    }
}