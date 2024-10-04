package com.juaracoding.oop;

public class Segitiga {
    int sisi;

    Segitiga(int sisi){
        this.sisi = sisi;
    }

    void draw(){
        for (int i = 0; i <= sisi; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= sisi; i++) {
            // Loop untuk mencetak spasi
            for (int j = sisi - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Loop untuk mencetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();  // Pindah ke baris berikutnya
        }
    }

}
