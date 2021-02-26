package com.epam.automation;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskThree {
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

        ArrayList<Integer> shorterThanMediumLength = new ArrayList<>(enteredNumber);
        ArrayList<Integer> longerThanMediumLength = new ArrayList<>(enteredNumber);
        int sumValueOfList = 0;
        double averageValueOfList = 0;

        for (int i = 0; i < listOfNumbers.size(); i++) {
            sumValueOfList += String.valueOf(Math.abs(listOfNumbers.get(i))).length();
            averageValueOfList = (double) sumValueOfList / enteredNumber;
        }

        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (String.valueOf(Math.abs(listOfNumbers.get(i))).length() > averageValueOfList) {
                longerThanMediumLength.add(listOfNumbers.get(i));
            } else {
                shorterThanMediumLength.add(listOfNumbers.get(i));
            }
        }

        System.out.println("Numbers whose length is less than average: " + shorterThanMediumLength);
        System.out.println("Numbers longer than average: " + longerThanMediumLength);
    }
}
