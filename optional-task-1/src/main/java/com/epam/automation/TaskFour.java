package com.epam.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskFour {
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

        ArrayList<Integer> listOfLengths = new ArrayList<>();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            ArrayList <Integer> listOfDigits = new ArrayList<Integer>();
            int numberToSplit = Math.abs(listOfNumbers.get(i));
            int lengthNumberToSplit = String.valueOf(Math.abs(numberToSplit)).length();
            while (numberToSplit != 0) {
                int numberToList = numberToSplit % 10;
                numberToSplit /= 10;
                if (listOfDigits.contains(numberToList) == false && lengthNumberToSplit > 1) {
                    listOfDigits.add(numberToList);
                } else {
                    continue;
                }
            }
            int arrayListSize = listOfDigits.size();
            listOfLengths.add(arrayListSize);

        }
        System.out.println("Number in which the number of distinct digits is minimal: " + listOfNumbers.get(listOfLengths.indexOf(Collections.min(listOfLengths))));
    }
}
