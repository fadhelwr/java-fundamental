package com.juaracoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstJava {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello JuaraCoding!");
        System.out.println("Indonesia");
        int x = 100;
        
        if(true){
            System.out.println("True");
            System.out.println(x);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(x);
        }
    }
}