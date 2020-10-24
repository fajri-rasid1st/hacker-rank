package com.java;

import java.util.Scanner;

public class TepatSasaran {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sukses = 0;
        int gagal = 0;

        int peluru = sc.nextInt();
        int sasaran = sc.nextInt();
        int fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        peluru = sc.nextInt();
        sasaran = sc.nextInt();
        fungsi = (peluru * peluru) + 1;

        if (fungsi == sasaran) {
            sukses++;
        } else {
            gagal++;
        }

        System.out.println("Peluru mengenai sasaran " + sukses);
        System.out.println("Peluru tidak mengenai sasaran " + gagal);

        sc.close();
    }
}
