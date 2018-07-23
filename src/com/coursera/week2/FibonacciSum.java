package com.coursera.week2;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.println(lastDigit(n));
    }

    public static int lastDigit(long n){
        int sum = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long min = 0, max = 1,add = 0;
            sum=1;
            for (long i = 1; i < n; i++) {
                add = min%10 + max%10;
                add = add%10;
                sum = (sum+(int)add)%10;
                min = max;
                max = add;

            }
            return sum;
//            Integer.MAX_VALUE
        }

    }


}
