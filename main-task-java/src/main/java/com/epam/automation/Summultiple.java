package com.epam.automation;

import java.util.Scanner;

public class Summultiple {

    public static void main(String[] args) {

        Scanner inputArguments = new Scanner(System.in);
        System.out.print("Input your numbers: ");
        int enteredNumbers = inputArguments.nextInt();
        int previousNumberForMultiply = 1;
        int previousNumberForSum = 0;
        while (enteredNumbers != 0) {
            int currentNumbers = enteredNumbers % 10;
            previousNumberForMultiply *= currentNumbers;
            previousNumberForSum += currentNumbers;
            enteredNumbers /= 10;
        }
        System.out.println("Product of numbers: " + previousNumberForMultiply);
        System.out.println("Sum of numbers: " + previousNumberForSum);




    }
}
