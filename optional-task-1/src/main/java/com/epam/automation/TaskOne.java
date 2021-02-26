package com.epam.automation;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOne {
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
        int maxNumber = listOfNumbers.get(0);
        int minNumber = listOfNumbers.get(0);
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (Math.abs(listOfNumbers.get(i)) > Math.abs(maxNumber)) {
                maxNumber = listOfNumbers.get(i);
            } else if (Math.abs(listOfNumbers.get(i)) < Math.abs(minNumber))
                minNumber = listOfNumbers.get(i);
        }
        int lengthMaxNumber = maxNumber >= 0 ? String.valueOf(maxNumber).length() : String.valueOf(maxNumber).length() - 1;
        int lengthMinNumber = minNumber >= 0 ? String.valueOf(minNumber).length() : String.valueOf(minNumber).length() - 1;

        System.out.println("Longest number = " + maxNumber + ", number length = " + lengthMaxNumber);
        System.out.println("Shortest number = " + minNumber + ", number length = " + lengthMinNumber);
    }

}
