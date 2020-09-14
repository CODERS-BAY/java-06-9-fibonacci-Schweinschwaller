package com.codersbay;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Hello Fibonacci");
        System.out.print("n-te Fibonacci Zahl:");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println();
        if (input < 46) {
            System.out.print(fibonacci(input, 1, 1, 1));
        } else {
            System.out.print(fibonacci(input, (long) 1, (long) 1, 1));
        }
        System.out.println();
    }

    public static int fibonacci(int border, int number1, int number2, int run) {
        if (border == run) {
            return number2;
        }
        return fibonacci(border, number1 + number2, number1, ++run);
    }

    public static long fibonacci(int border, long number1, long number2, int run) {
        if (border == run) {
            return number2;
        }
        return fibonacci(border, number1 + number2, number1, ++run);
    }
}