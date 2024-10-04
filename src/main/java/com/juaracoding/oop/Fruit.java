package com.juaracoding.oop;

public class Fruit {

    //state
    int grams;
    int calsPerGram;

    // behavior
    int totalCalories(){
        return grams * calsPerGram;
    }


}
