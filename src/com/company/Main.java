package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String response = "";

        do {
            System.out.println("Enter any number");
            int value = input.nextInt();

            for (int i = value; i >= 1; --i) {
            if (i % 35 == 0){
                System.out.println("CopyCat");
                } else if (i % 7 ==0) {
                System.out.println("Cat");
            }else if (i %5 ==0) {
                System.out.println("Copy");
            }else
                System.out.println(i);
            }

            System.out.println("Would you like to enter another number? (y/n)");
            response = input.next();
        }
            while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) ;
            System.out.println("Thanks for playing!");
        }
    }
