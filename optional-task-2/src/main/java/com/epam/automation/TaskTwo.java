package com.epam.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner matrixDimension = new Scanner(System.in);
        System.out.print("Enter the matrix dimension: ");
        int enteredDimension = matrixDimension.nextInt();

        Scanner rangeOfValues = new Scanner(System.in);
        System.out.print("Enter the range of values (m) from -m to m: ");
        int enteredRangeOfValues = rangeOfValues.nextInt();


        System.out.println();


        System.out.println("Random matrix:");
        final int[][] arrayOfNumbers = new int[enteredDimension][enteredDimension];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                int min = 0 - enteredRangeOfValues;
                int max = enteredRangeOfValues;
                int diff = max - min;
                Random random = new Random();
                int randomNumber = random.nextInt(diff + 1) + min;
                arrayOfNumbers[i][j] = randomNumber;
                System.out.print(arrayOfNumbers[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println();


        ArrayList<Integer> copyArray = new ArrayList<>();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                int numberToArray = arrayOfNumbers[i][j];
                copyArray.add(numberToArray);
            }
        }


        ArrayList<Integer> numberOfAscendingElements = new ArrayList<>();
        ArrayList<Integer> numberOfDescendingElements = new ArrayList<>();
        int countAsc = 0;
        int countDesc = 0;
        for (int i = 0; i < (copyArray.size() - 1); i++) {
            if (copyArray.get(i) > copyArray.get(i+1)) {
                countDesc++;
                countAsc = 0;
                numberOfDescendingElements.add(countDesc + 1);
                numberOfAscendingElements.add(0);
            } else {
                countAsc++;
                countDesc = 0;
                numberOfAscendingElements.add(countAsc + 1);
                numberOfDescendingElements.add(0);
            }
        }


        System.out.println("The largest number of increasing matrix elements in a row: " + Collections.max(numberOfAscendingElements));
        System.out.println("The largest number of decreasing matrix elements in a row: " + Collections.max(numberOfDescendingElements));
    }
}
