package com.cick;

public class Kangaroo{
    public static void main(String[] args){
        
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int start_1 = userInput.nextInt();
        int jump_1 = userInput.nextInt();
        int start_2 = userInput.nextInt();
        int jump_2 = userInput.nextInt();

        int totalJump1 = start_1;
        int totalJump2 = start_2;
        int sum1 = 0;
        int sum2 = 0;

        if (start_1 > start_2) {
            System.out.println("Start 1 must smallest than start 2");
            userInput.close();
            return;
        }
        
        for (int i = start_1 ; i <= 100000000 ; i += jump_1) {
            for(int j = start_2 ; j <= start_2 ; j += jump_2) {
                totalJump1 += jump_1;
                totalJump2 += jump_2;
                sum1++;
                sum2++;
                if (totalJump1 == totalJump2 && sum1 == sum2){
                    System.out.println("YES");
                    userInput.close();
                    return;
                }
            }
        }
        System.out.println("NO");
        userInput.close();
    }
}