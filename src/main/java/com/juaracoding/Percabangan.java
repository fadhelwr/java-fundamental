package com.juaracoding;

import java.util.Scanner;

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
        String size = "s";
        int qty =2;
        int price = 0;
        if (size.equalsIgnoreCase("S")){
            price = 50000;
        } else if (size.equalsIgnoreCase("M")) {
            price = 60000;
        } else if (size.equalsIgnoreCase("L")){
            price = 70000;
        } else {
            System.out.println("Tidak ada ukuran tersebut");
        }

        System.out.println("Size "+size.toUpperCase()+" Price: "+price);

        //true AND false
        String inputUsername = "admin";
        String inputPassword = "p4ssw0rd";
        if (inputUsername.equals("admin") && inputPassword.equals("p4ssw0rd")){
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        //platyNomor ganjil, tanggal ganjil
        //platNomor genap, tanggal genap
        int platNomor = 1234;
        int tanggal = 31;
        if ((platNomor %2 == 0 && tanggal % 2 == 0) || (platNomor % 2 == 1 && tanggal % 2 ==1)){
            System.out.println("bisa melewati jalan Soekarno Hatta");
        } else if (platNomor %2 == 1 && tanggal % 2 == 0){
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, karena plat nomor genap tanggal genap");
        } else {
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, karena plat nomor ganjil tanggal ganjil");
        }

        // nested if
        // isMember = 10%, isFirstTimerBuyer = 5%, hasCoupon = 2%
        // totalAmount > 500000 dapat discount
        boolean isMember = true;
        boolean isFirstTimeBuyer = false;
        boolean hasCoupon = false;
        double discount = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan total bayar = ");
        double totalAmount = scanner.nextDouble();

        if (totalAmount > 500000){
            if (isMember){
                discount = 0.1; // 10%
            } else if (isFirstTimeBuyer) {
                discount = 0.05; //5%
            } else if (hasCoupon){
                discount = 0.02;
            }
        }
        System.out.println("Discount = "+discount*100+"%");
        System.out.println("Total bayar = Rp "+(totalAmount-totalAmount*discount));

    }
}
