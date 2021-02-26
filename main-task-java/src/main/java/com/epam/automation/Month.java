package com.epam.automation;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        Scanner scannerOfNumbers = new Scanner(System.in);
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int enteredNumbers;
        do {
            System.out.print("Please enter a positive integer from 1 to 12! ");
            while (!scannerOfNumbers.hasNextInt()) {
                System.out.print("That not an integer! Try again! ");
                scannerOfNumbers.next();
            }
            enteredNumbers = scannerOfNumbers.nextInt();
        } while (enteredNumbers < 1 || enteredNumbers > 12);
        System.out.println("Name of the month: " + monthNames[enteredNumbers - 1]);


    }
}
