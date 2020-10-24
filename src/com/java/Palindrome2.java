package com.java;

import java.util.Scanner;

// Buat class dengan nama Palindrome2
public class Palindrome2 {
    // Buat main method
    public static void main(String[] args) {
        // deklarasi dan inisialisasi Scanner untuk menerima inputan user
        Scanner sc = new Scanner(System.in);

        // kata yang diinput user
        String kata = "hitau hitau";

        // panjang kata (berupa bilangan bulat)
        int panjangKata = 11;

        // jika panjang string <= 8 atau >= 12, maka
        if (panjangKata <= 8 || panjangKata >= 12) {
            // cetak panjang string tidak sesuai
            System.out.println("Panjang String Tidak Sesuai");
            // close scanner
            sc.close();
            // keluar program
            return;
        }

        // deklarasi variable boolean dengan nilai default true
        boolean kondisi = true;
        if (kata.charAt(0) != kata.charAt(panjangKata - 1)) {
            kondisi = false;
        }
        if (kata.charAt(1) != kata.charAt(panjangKata - 2)) {
            kondisi = false;
        }
        if (kata.charAt(2) != kata.charAt(panjangKata - 3)) {
            kondisi = false;
        }
        if (kata.charAt(3) != kata.charAt(panjangKata - 4)) {
            kondisi = false;
        }
        if (kata.charAt(4) != kata.charAt(panjangKata - 5)) {
            kondisi = false;
        }

        // jika kondisi memenuhi alias true
        if (kondisi) {
            // cetak bahwa kata bersifat palindrome
            System.out.println(kata + " is Palindrome");
        }
        // jika kondisi tidak memenuhi alias false
        else {
            // cetak bahwa kata tidak bersifat palindrome
            System.out.println(kata + " not Palindrome");
        }

        // tutup scanner (optional)
        sc.close();
    }
}