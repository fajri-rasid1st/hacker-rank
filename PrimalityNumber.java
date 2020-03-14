package com.cick;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityNumber {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        BigInteger number = userInput.nextBigInteger();
        userInput.close();

        System.out.println(number.isProbablePrime(1) ? "prime" : "not prime");
    }
}