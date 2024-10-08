package com.juaracoding.oop.polymorphism;

public class Kotak extends BidangDatar {

    private int sisi;

    public Kotak(int sisi){
        //sisi = sisi;
        this.sisi = sisi;
    }

    // method overriding
    public void draw(){
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
