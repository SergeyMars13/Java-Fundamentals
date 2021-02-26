package com.epam.automation;

import java.util.ArrayList;
import java.util.Scanner;

public class Random {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Input number of numbers: ");
        int inputNumOfNumbers = scanner1.nextInt();
        System.out.print("Input minimum range number: ");
        int inputMinRangeNumber = scanner1.nextInt();
        System.out.print("Input maximum range number: ");
        int inputMaxRangeNumber = scanner1.nextInt();
        ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
        for (int i = 0; i < inputNumOfNumbers; i++) {
            int randomNumber = (int) (Math.random() * (inputMaxRangeNumber - inputMinRangeNumber + 1) + inputMinRangeNumber);
            listOfNumber.add(randomNumber);
            System.out.println(randomNumber);
        }
        scanner1.close();
        System.out.print(listOfNumber);



    }
}
