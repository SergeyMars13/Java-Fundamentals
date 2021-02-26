package com.epam.automation;


import java.util.*;


public class TaskFour {
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


        int maxValue = arrayOfNumbers[0][0];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                if (arrayOfNumbers[i][j] > maxValue) {
                    maxValue = arrayOfNumbers[i][j];
                }
            }
        }
        System.out.print("Maximum number in a matrix: " + maxValue);


        System.out.println();


        ArrayList<ArrayList<Integer>> listArray = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                list.add(arrayOfNumbers[i][j]);
            }
            if (list.contains(maxValue) == false) {
                listArray.add(list);
            }
        }


        System.out.println();


        System.out.println("Matrix without rows containing the maximum random matrix element:");
        int[][] newArray = new int[listArray.size()][enteredDimension];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = listArray.get(i).get(j);
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
