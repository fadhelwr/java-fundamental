package com.juaracoding;

import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {

        // cara 1
        int[] angka = {1,2,3,4,5}; // index 0 - 4
        System.out.println(angka[2]); // panggil index ke-2

        // cara 2
        int[] grades = new int[5];
        grades[0] = 80;
        grades[1] = 81;
        grades[2] = 82;
        grades[3] = 83;
        grades[4] = 84;
        System.out.println(grades[2]);

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("For each");
        for (int grade : grades) {
            System.out.println(grade);
        }

        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for (String car : cars){
            System.out.println(car.toUpperCase());
        }

        // array multidimensi
        int[][] angkaKu = {{1,2,3,4},{5,6,7}};
        System.out.println(angkaKu[1][2]);

        System.out.println("Jumlah baris = "+angkaKu.length);
        System.out.println("Jumlah baris ke 1 = "+angkaKu[0].length);
        System.out.println("Jumlah baris ke 2= "+angkaKu[1].length);

        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu[i].length; j++) {
                System.out.println(angkaKu[i][j]);
            }
        }

        // buatkan scanner input data city: Jakarta, Bandung, Surabaya, Bali, Makassar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah data yang akan diinput = ");
        int jmlData = scanner.nextInt();
        //String[] cities = new String[jmlData];
        System.out.println("Input nama kota = ");

        //menjumlahkan list data harga
        double[] prices = {10000,50000,70000,90000,100000};
        double sum = 0;
        //for (int i = 0; i < prices.length; i++) {
          //  sum += prices[i]; //sum = 130000 + 90000
        //}

        for (double price : prices){
            sum += price;
        }
        System.out.println("Jumlah bayar = "+sum);

        // Mendefinisikan array kota dengan elemen terpisah
        String[] cities = {"Jakarta", "Bandung", "Surabaya", "Bali", "Makassar"};

        System.out.println("Masukkan data yang ingin dicari = ");
        String search = scanner.next();  // Menggunakan nextLine() untuk menerima input

        boolean isfound = false;

        // Mencari kota dalam array
        for (int i = 0; i < cities.length; i++) {
            if (search.equalsIgnoreCase(cities[i])) {  // Membandingkan string
                isfound = true;
                break;  // Jika ditemukan, keluar dari loop
            }
        }

        // Menampilkan hasil pencarian
        if (isfound) {
            System.out.println("Data ditemukan: " + search);
        } else {
            System.out.println("Data tidak ditemukan.");
        }

        scanner.close(); // Menutup scanner

    }
}
