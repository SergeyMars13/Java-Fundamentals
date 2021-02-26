package com.epam.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TaskTwo {
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

        Collections.sort(listOfNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (String.valueOf(Math.abs(o1)).length() < String.valueOf(Math.abs(o2)).length()) {
                    return 1;
                //} else {
                  //  return o1.compareTo(o2);
                } else {
                    return -1;
                }
            }

        });

        ArrayList<Integer> listOfNumbersSortAscending = new ArrayList<>(listOfNumbers);
        Collections.reverse(listOfNumbersSortAscending);

        System.out.println("Numbers sorted in descending order of length: " + listOfNumbers);
        System.out.println("Numbers sorted in ascending order of length: " + listOfNumbersSortAscending);
    }
}
