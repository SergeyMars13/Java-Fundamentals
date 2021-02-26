package com.epam.automation;

import java.util.*;

public class TaskOne {
    public static void main(String[] args) {

        Scanner matrixDimension = new Scanner(System.in);
        System.out.print("Enter the matrix dimension: ");
        int enteredDimension = matrixDimension.nextInt();

        Scanner rangeOfValues = new Scanner(System.in);
        System.out.print("Enter the range of values (m) from -m to m: ");
        int enteredRangeOfValues = rangeOfValues.nextInt();


        System.out.println("Random matrix");
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


        System.out.println("Row sorted matrix");
        int[][] arrayRow = new int[enteredDimension][enteredDimension];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Arrays.sort(arrayOfNumbers[i]);
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                int num = arrayOfNumbers[i][j];
                num = arrayRow[i][j];
            }
        }
        for (int i = 0; i < arrayRow.length; i++) {
            for (int j = 0; j < arrayRow[i].length; j++) {
                System.out.print(arrayOfNumbers[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println();

        Scanner sort = new Scanner(System.in);
        System.out.print("Enter the column number to sort: ");
        final int column = sort.nextInt();

        System.out.println();


        Arrays.sort(arrayOfNumbers, new Comparator<int[]>() {
            @Override
            public int compare(int[] array1,int[] array2) {
                if (array1[column-1] > array2[column-1])
                    return 1;
                else
                    return -1;
            }
        });
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                System.out.print(arrayOfNumbers[i][j] +"\t");
            }
            System.out.println();
        }


    }
}
