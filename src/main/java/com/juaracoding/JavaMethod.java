package com.juaracoding;

public class JavaMethod {
    public static void main(String[] args) {

        //reusable
        drawKotak(5);
        drawKotak(10);


        double sisi = 10;
        double luas = luasKotak(sisi);
        System.out.println(luas);
        System.out.println(luasKotak(12));

        System.out.println(setName("Juara Coding"));
        System.out.println(setText("Indonesia"));

        System.out.println(login("admin", "p4ssw0rd"));

        calculateTax(7000,'L');
        calculateTax(6000,'P');

        String[] cities = {"Jakarta", "Bandung", "Surabaya", "Kalimantan", "Bali", "Makassar"};
        cariKataTerpanjang(cities);
    }

    static void drawKotak(int sisi){
        for (int i = 0; i < sisi; i++) { // i = 0
            for (int j = 0; j < sisi; j++) { // 10 < 10 (false)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double luasKotak(double sisi){
        return sisi + sisi;
    }

    static String setName(String name){
        return  name;
    }

    // Validate text contains
    static boolean setText(String text){
        return  text.contains("Indo");
    }

    // fungsi login raeturn boolean
    static boolean login(String username, String password){
        if (username.equals("admin") && password.equals("p4ssw0rd")){
            return true;
        } else {
            return false;
        }
    }

    // calculateTax (salary, gender)
    // wajib pajak minimal salary 7000
    // gender L 10%, P 5%
    static void calculateTax(double salary, char gender){
        if (salary > 7000){
            if (gender == 'P'){
                System.out.println(salary * 0.05);
            } else {
                System.out.println(salary * 0.1);
            }
        } else {
            System.out.println(salary * 0.0);
        }
    }

    // cari kata terpanjang
    // String[] cities = {"Jakarta", "Bandung", "Surabaya", "Kalimantan", "Bali", "Makassar"};
    static void cariKataTerpanjang(String[] cities){
        int kataTerpanjang = 0;
        int index = 0;
        String city = null;
        for (int i = 0; i < cities.length; i++) {
            if (kataTerpanjang < cities[i].length()){ // 10 < 8
                kataTerpanjang = cities[i].length();
                index = i;
                city = cities[i];
            }
        }
        System.out.println("Kata terpanjang ada di index ke "+index+" yaitu "+city);
    }
}
