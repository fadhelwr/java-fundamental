package com.juaracoding.oop;

public class Car {
    String bahanBakar;
    int tahunPembuatan = 2000;

    Car(String bahanBakar){
        this.bahanBakar =bahanBakar;
    }

    void warna(){
        System.out.println("Berwarna merah");
    }

    void mesin(){
        System.out.println("Bermesin 1800cc");
    }

    int getTahunPembuatan(){
        return tahunPembuatan;
    }
}
