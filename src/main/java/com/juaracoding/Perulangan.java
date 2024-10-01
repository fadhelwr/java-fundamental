package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("Next statement");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1){ // 2 % 2 = 0 == 1 (false)
                System.out.print(i+" ");
            }
        }

        for (int i = 1; i < 10; i+=2) { // i = 3 + 2
            System.out.print(i+" ");
        }

        for (int i = 1; i < 10; i++) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        // decrement
        for (int i = 9; i > 0; i--) { // 0 > 0 (false)
            System.out.print(i+" ");
            i--;
        }
        System.out.println();

        // nested for
        // *****
        // *****
        // *****
        // *****
        // *****
        int sisi = 5;
        for (int i = 0; i < sisi; i++) { // i = 0
            for (int j = 0; j < sisi; j++) { // 10 < 10 (false)
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Next statement");

        // *
        // **
        // ***
        for (int i = 1; i <= sisi; i++) { // i = 0
            for (int j = 0; j < i; j++) { // 10 < 10 (false)
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // ***
        // **
        // *
        for (int i = sisi; i >= 1; i--) { // Mulai dari 3 bintang, lalu kurangi
            for (int j = 1; j <= i; j++) { // Cetak bintang sebanyak nilai i
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris baru setelah mencetak bintang
        }

        // while
        int x = 0;
        System.out.print("X");
        while (x < 5){
            System.out.print(x);
            x++;
        }
        System.out.println();
        System.out.println("Next statement");

        // do while
        int y = 0;
        System.out.print("Y");
        do {
            System.out.print(y);
            y++;
        } while (y < 0);

        // break / continue
        while (x < 6){
            if (x == 3) break;
            System.out.println("Looping ke "+x);
            x++;
        }

        while (x < 6){
            if (x == 3) {
                x++;
                continue;
            }
            System.out.println("Looping ke "+x);
            x++;
        }

        // input angka berapapun, tapi ketika input angka 0 akan keluar looping
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input angka = ");
            int angka = scanner.nextInt();
            System.out.println(angka);
            if (angka == 0){
                break;
            }
        }

    }
}
