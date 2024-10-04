package com.juaracoding.oop;

public class Employee {
    String name;
    String divisi;
    double salary;
    boolean isActive;

    Employee(String name, String divisi, double salary, boolean isActive){
        this.name = name;
        this.divisi = divisi;
        this.salary = salary;
        this.isActive = isActive;
    }

    double calculateTax(){
        if(salary > 7000){
            return salary * 0.15;
        } else {
            return salary * 0.0;
        }
    }

    void displayInfoEmp(){
        System.out.println("Name \t\t: "+name);
        System.out.println("Divisi \t\t: "+divisi);
        System.out.println("Salary \t\t: "+salary);
        System.out.println("Is Active \t: "+isActive);
        System.out.println("PPh \t\t: "+calculateTax());
    }
}
