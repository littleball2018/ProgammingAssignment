package com.coursera.week1;

import java.util.Scanner;

public class maximum_pairwise_product {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String numbersStr = s.nextLine();
        String[] numbersStrs = numbersStr.split(" ");
        int[] numbers = new int[n];
        int max2 = 0;
        int max1 = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numbersStrs[i]);
            if (numbers[i] >= max1) {
                max2 = max1;
                max1 = numbers[i];
            } else if (numbers[i] >= max2) {
                max2 = numbers[i];
            }
        }
        long result = (long)max1*(long)max2;
        System.out.println(String.valueOf(result));



    }
}
