package com.heightslicking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        testOddness();
        keepContained();
        lastDigit();
    }

    public static void testOddness() {    // write your code here
        //todo even or odd
        //todo keep number contained
        //todo get the last digit

        Scanner keyboard;
        int positiveNumber;


        keyboard = new Scanner(System.in);
        System.out.println("Give me a positive number.");
        positiveNumber = keyboard.nextInt();
        System.out.println("Number is even: " + (positiveNumber % 2 == 0));
        System.out.println("Number is odd: " + (positiveNumber % 2 != 0));

    }

    public static void keepContained() {
        //todo keep number contained

        Scanner keyboard;
        int number;

        keyboard = new Scanner(System.in);
        System.out.println("I need a positive number.");
        number = keyboard.nextInt();
        System.out.println((number % 8) + 5);
        System.out.println(number + " is contained:" + ((number % 8) + 5));

    }


    public static void lastDigit() {


        // todo get the last digit
        Scanner keyboard;
        int positiveNumber2;

                keyboard = new Scanner(System.in);
        System.out.println("Please give me a number that's four places long. (EX.2308)");
        positiveNumber2 = keyboard.nextInt();
                System.out.println("The Last Digit is: "+positiveNumber2%10);
    }


}







