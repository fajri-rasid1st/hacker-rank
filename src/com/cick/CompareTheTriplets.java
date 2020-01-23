package com.cick;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        int[] aliceInput = new int[3];
        int[] bobInput = new int[3];
        int alicePoint = 0;
        int bobPoint = 0;

        for(int i = 0 ; i < 3 ; i++){
            aliceInput[i] = userInput.nextInt();
            if(aliceInput[i] > 100 || aliceInput[i] < 1){
                break;
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            bobInput[i] = userInput.nextInt();
            if(bobInput[i] > 100 || bobInput[i] < 1){
                break;
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            if (aliceInput[i] > bobInput[i]){
                alicePoint++;
            }else if (aliceInput[i] < bobInput[i]){
                bobPoint++;
            }
        }
        System.out.print(alicePoint + " " + bobPoint);

        userInput.close();
    }
}