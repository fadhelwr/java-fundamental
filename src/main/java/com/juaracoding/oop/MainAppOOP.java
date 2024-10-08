package com.juaracoding.oop;

import com.juaracoding.oop.encapsulation.User;
import com.juaracoding.oop.inheritance.Calculate;
import com.juaracoding.oop.inheritance.Manager;
import com.juaracoding.oop.polymorphism.BidangDatar;
import com.juaracoding.oop.polymorphism.Calculator;
import com.juaracoding.oop.polymorphism.Kotak;

public class MainAppOOP {
    public static void main(String[] args) {

        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("p4ssw0rd");

        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());

        Calculator calculator = new Calculator();
        calculator.sum(10.5,5);
        calculator.sum(10,5);
        calculator.sum(10,5,3);

        BidangDatar bidangDatar = new BidangDatar();
        BidangDatar kotak = new Kotak(5);
        bidangDatar.draw();
        kotak.draw();

        Manager manager = new Manager();
        manager.setName("John");
        manager.setAddress("Jakarta");
        manager.setSalary(15000);
        manager.setDepartment("IT");
        System.out.println(manager.getName());
        System.out.println(manager.getAddress());
        System.out.println(manager.getSalary());
        System.out.println(manager.getDepartment());

        //calculate tax
        System.out.println(manager.calculateTax());
        System.out.println(Calculate.calculateTax(manager.getSalary()));

    }
}
