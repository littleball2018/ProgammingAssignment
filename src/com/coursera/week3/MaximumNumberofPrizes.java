package com.coursera.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumNumberofPrizes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List numbers = new ArrayList();
        int sum = 0;

        for (int number = 1;sum!=n ; number++) {

            sum = sum + number;
            if ((sum==n)||(sum <= n && (n - sum) > number)) {
                numbers.add(number);

            }else {
                sum=sum-number;
            }

        }
        System.out.println(numbers.size());
        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
    }
}
