package com.epam.automation;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFive {
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

        ArrayList<Integer> listOfEven = new ArrayList<>();
        ArrayList<Integer> listOfOdd = new ArrayList<>();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            int currentNumber = listOfNumbers.get(i);
            int lengthCurrentNumber = String.valueOf(Math.abs(currentNumber)).length();
            int currentNumberForLoop = currentNumber;
            int count = 0;
            while (currentNumberForLoop != 0) {
                int digit = currentNumberForLoop % 10;
                if (digit % 2 == 0) {
                    count++;
                }
                currentNumberForLoop /= 10;
            }
            if (lengthCurrentNumber == count) {
                listOfEven.add(currentNumber);
            } else if ((double) lengthCurrentNumber / 2 == count && lengthCurrentNumber > 1) {
                listOfOdd.add(currentNumber);
            }
        }
        System.out.println("Number of numbers which contain only even digits: " + listOfEven.size());
        System.out.println("Number of numbers with an equal number of even and odd digits: " + listOfOdd.size());
    }
}

