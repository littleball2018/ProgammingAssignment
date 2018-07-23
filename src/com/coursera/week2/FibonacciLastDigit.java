package com.coursera.week2;

import java.util.Scanner;

public class FibonacciLastDigit {

    private static int fibonacciLastDigitCount(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int min = 0, max = 1, result = 0;
            for (int i = 1; i < n; i++) {
                result = min + max;
                result = result%10;
                min = max;
                max = result;
            }
            return result;

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibonacciLastDigitCount(n));
    }
}
