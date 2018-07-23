package com.coursera.week3;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAdvertisementRevenue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
//            System.out.println(a[i]);
//            System.out.println(b[i]);
            sum = sum + (long)a[i] * b[i];
        }
        System.out.println(sum);


    }

//    public static int[] sort(int[] input) {
//        int temp;
//        for (int i = 0; i < input.length; i++) {
//            for (int j = i; j < input.length; j++) {
//                if (input[i] < input[j]) {
//                    temp = input[j];
//                    input[j] = input[i];
//                    input[i] = temp;
//                }
//            }
//        }
//        return input;
//    }
}
