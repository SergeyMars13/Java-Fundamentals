package com.epam.automation;

// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class Revers {

    public static void main(String[] args) {

        Scanner inputArguments = new Scanner(System.in);
        System.out.print("Input your arguments: ");
        String arguments = inputArguments.nextLine();
        String revers = new StringBuffer(arguments).reverse().toString();
        System.out.print("Revers order of arguments: " + revers);
        inputArguments.close();

    }
}
