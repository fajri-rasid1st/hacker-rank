package com.java;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        String number_1 = userInput.next();
        String number_2 = userInput.next();

        BigInteger a = new BigInteger(number_1);
        BigInteger b = new BigInteger(number_2);

        System.out.printf("%d \n%d", a.add(b), a.multiply(b));

        userInput.close();
    }
}