package com.epam.automation;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {

        Scanner scannerForNumberToEnter = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int enteredNumber = scannerForNumberToEnter.nextInt();

        Scanner scannerForNumbers = new Scanner(System.in);
        System.out.println("Enter " + enteredNumber + " numbers:");

        ArrayList<Integer> listOfNumbers = new ArrayList<>(enteredNumber);
        while (enteredNumber > listOfNumbers.size()) {
            int entNumbers = scannerForNumbers.nextInt();
            listOfNumbers.add(entNumbers);
        }

        ArrayList<Integer> listOfNumbersAscendingDigits = new ArrayList<>(enteredNumber);

        for (int i = 0; i < listOfNumbers.size(); i++) {
            int curNumber = listOfNumbers.get(i);
            int curNumberForLoop = Math.abs(curNumber);
            int previousNumber = curNumberForLoop % 10;
            int count = 0;
            while (curNumberForLoop != 0) {
                int digit = curNumberForLoop % 10;
                if (previousNumber >= digit) {
                    previousNumber = digit;
                    count++;
                }
                curNumberForLoop /= 10;
            }
            if (String.valueOf(Math.abs(curNumber)).length() == count) {
                listOfNumbersAscendingDigits.add(curNumber);
            }
        }
        System.out.println("Number with digits in strict ascending order: " + listOfNumbersAscendingDigits.get(0));
    }
}
