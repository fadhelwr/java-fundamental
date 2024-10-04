package com.juaracoding.oop;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.grams = 2;
        apple.calsPerGram = 57;
        System.out.println(apple.totalCalories());
        System.out.println(apple);

        Fruit mango = new Fruit();
        mango.grams = 3;
        mango.calsPerGram = 56;
        System.out.println(mango.totalCalories());
        System.out.println(mango);

        Date date = new Date(2000);
        System.out.println(date);

        //Kotak kotakPertama = new Kotak();
        //kotakPertama.sisi = 10;
        //kotakPertama.draw();

        Kotak kotakPertama = new Kotak(10);
        kotakPertama.draw();

        //Kotak kotakKedua = new Kotak();
        //kotakKedua.sisi = 10;
        //kotakKedua.draw();

        Kotak kotakKedua = new Kotak(5);
        kotakKedua.draw();

        Segitiga segitigaPertama = new Segitiga(5);
        segitigaPertama.draw();

        //Car
        Car car = new Car("Peratalite");
        car.warna();
        car.mesin();
        System.out.println(car.bahanBakar);
        System.out.println(car.getTahunPembuatan());

        //Employee
        Employee employee = new Employee("Budi", "Technology",70000, true);
        employee.salary = 10000;
        employee.displayInfoEmp();

    }
}
