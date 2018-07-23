package com.coursera.week2;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int gcd = gcd(a,b);
        long result = (long)a*(long)b/(long)gcd;
        System.out.println(result);

    }

    public static int gcd(int a,  int b){
        int result=b;
        int shang;
        while ((shang = a%b) != 0) {
            a=b;
            b=shang;
            result = b;
        }
        return result;
    }
}
