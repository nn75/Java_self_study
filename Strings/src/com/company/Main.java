package com.company;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //double
        //float
        //boolean
        //char
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
