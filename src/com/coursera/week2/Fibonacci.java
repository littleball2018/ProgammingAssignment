package com.coursera.week2;

import java.util.Scanner;

public class Fibonacci {
    private static int fibonacciCount(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int min = 0, max = 1, result = 0;
            for (int i = 1; i < n; i++) {
                result = min + max;
                min = max;
                max = result;
            }
            return result;
        }

//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }else {
//            return fibonacciCount(n-1)+fibonacciCount(n-2);
//        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibonacciCount(n));
    }
}
