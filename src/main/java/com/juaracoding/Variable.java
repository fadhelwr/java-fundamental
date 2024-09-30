package com.juaracoding;

public class Variable {
    public static void main(String[] args) {
        // numeric
        byte countCart = 100;
        short stock = 10000;
        int price = 1000000;
        long saldo = 30000000000L;

        float grade = 95.5f;
        double salary = 1000000000.95;

        // char
        char akreditasi = 'A';

        // boolean
        boolean isResult = true;

        // C:\Program Files\apache-maven-3.9.9
        String path = "C:\\Program Files\\apache-maven-3.9.9";
        System.out.println(path);

        // buatkan tampilan ke console user profile gunakan variabel dan tipe data yang tepat
        String address = "Jakarta";
        address = "Bogor";
        System.out.println(address);

        // automatic casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);

        char data2 = 'Z';
        long dataLong = data2;
        System.out.println(dataLong);

        //manual casting
        long data = 9223372036854775000l;
        int dataInt = (int) data;
        System.out.println(dataInt);
    }
}
