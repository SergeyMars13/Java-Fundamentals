package com.epam.automation;

// Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class Hello
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.printf("Hello, %s! \n", name);
        in.close();
    }
}
