package com.cick;

import java.util.Arrays;

public class DesignPdf {
    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = userInput.nextInt();
            if (alphabet[i] < 1 || alphabet[i] > 7) {
                userInput.close();
                return;
            }
        }
        String word = userInput.next();

        DesignPdf pdf = new DesignPdf();
        int result = pdf.designerPDFViewer(alphabet, word);
        System.out.print(result);

        userInput.close();
    }

    int designerPDFViewer(int[] alphabet, String word) {
        char a;
        char[] b = new char[26];
        int c = 0;
        for (a = 'a'; a <= 'z'; a++) {
            b[c] = a;
            c++;
        }
        int[] d = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < b.length; j++) {
                if (word.charAt(i) == b[j]) {
                    d[i] = alphabet[j];
                }
            }
        }
        Arrays.sort(d);
        return ((word.length() * 1 * d[d.length - 1]));
    }
}