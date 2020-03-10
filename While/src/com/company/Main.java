package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            count ++;
//            System.out.println("Count value is " + count);
//        } while (count != 6);
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
    }

    //Challenge
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
