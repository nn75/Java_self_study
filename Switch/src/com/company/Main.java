package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        //Challenge
        char charValue = 'C';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            default:
                System.out.println("Could not found A, B");
                break;
        }

        //Challenge
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
