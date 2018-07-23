package com.coursera.week2;

import java.util.Scanner;

public class Gcd {
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(gcd(a,b));
    }
}
