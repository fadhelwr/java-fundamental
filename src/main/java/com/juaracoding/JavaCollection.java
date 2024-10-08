package com.juaracoding;

import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(2));
        cars.set(2,"Toyota");
        cars.add(2,"Mitsubishi");
        System.out.println(cars);
        System.out.println(cars.remove(1));

        //for1
        System.out.println(cars.size());
        for (int i = 1; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //foreach
        System.out.println("-- for each --");
        for (String car : cars){
            System.out.println(car.toUpperCase());
        }
    }
}
