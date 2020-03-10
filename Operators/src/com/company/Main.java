package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        result = result / 5;
        result = result % 3;

        //result = result + 1
        result++;
        result--;
        result += 2;
        result *= 10;
        result /= 3;
        result -=2;

        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        boolean isCar = false;
        boolean wasCar = (isCar) ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }


        //Challenge
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = ( theRemainder == 0 ) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
