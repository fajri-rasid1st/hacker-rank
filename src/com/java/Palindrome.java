package com.java;

import java.util.Scanner;

// Buat class dengan nama Palindrome
public class Palindrome {
    // Buat main method
    public static void main(String[] args) {
        // deklarasi dan inisialisasi Scanner untuk menerima inputan user
        Scanner sc = new Scanner(System.in);

        // inputan user di tampung di variable words dengan tipe data array
        // method split berguna untuk memecah string -> array sesuai parameter regex
        // pada kasus ini kita akan memecah string saat terdapat spasi (" ")
        String[] words = sc.nextLine().split(" ");

        // syarat panjang string
        int length = String.format("%s %s", words[0], words[1]).length();

        // jika panjang string <= 8 atau >= 12, maka
        if (length <= 8 || length >= 12) {
            // cetak panjang string tidak sesuai
            System.out.println("Panjang String Tidak Sesuai");

            // close scanner
            sc.close();

            // Keluar Program
            return;
        }

        // string pertama adalah kata yang terurut dari kiri -> kanan
        // terdapat pada variable words index ke 0
        String original = words[0];

        // string kedua adalah kata yang terurut dari kanan -> kiri
        // terdapat pada variable words index ke 1
        String reverse = words[1];

        // kita deklarasikan string kosong yang nantinya berisi string,
        // hasil dari mengurutkan string pada variable reverse dari kiri -> kanan
        String newStr = "";

        // lakukan perulangan
        for (int i = reverse.length() - 1; i >= 0; i--) {
            // isi string pada variable newStr dengan karakter pada index ke i
            newStr += reverse.charAt(i);
        }

        // cek jika string pada variable original sama dengan newStr
        if (original.equalsIgnoreCase(newStr)) {
            // cetak bahwa keduanya palindrom
            System.out.printf("%s %s adalah Palindrome", words[0], words[1]);
        }
        // jika tidak sama berarti keduanya tidak palindrom
        else {
            // cetak bahwa keduanya bukan palindrom
            System.out.printf("%s %s bukan Palindrome", words[0], words[1]);
        }

        // tutup scanner (optional)
        sc.close();
    }
}