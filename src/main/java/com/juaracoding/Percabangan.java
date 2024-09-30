package com.juaracoding;

public class Percabangan {
    public static void main(String[] args) {

        if (false){
            System.out.println("Statement");
        }

        System.out.println("New Statement");


        int suhu = 36;
        if (suhu <= 36){
            System.out.println("Cuaca Normal");
        } else {
            System.out.println("Cuaca Sangat Panas");
        }

        // 1 3 5
        // 2 4 6

        int angka = 4;
        if (angka % 2 == 0) {
            System.out.println(angka+" Bilangan Genap");
        } else{
            System.out.println(angka+" Bilangan Ganjil");
        }

        //if majemuk (nested if)
        // size S = 50000, M = 60000, L = 70000



    }
}
