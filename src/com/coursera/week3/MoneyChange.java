package com.coursera.week3;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int sum = 0;
        int count = 0;

        while(sum<=input){
            sum = sum+10;
            count++;
        }
        if(sum>input){
            count--;
            sum = sum-10;
        }
        while(sum<=input){
            sum = sum+5;
            count++;
        }
        if(sum>input){
            count--;
            sum = sum-5;
        }
        while(sum<=input){
            sum = sum+1;
            count++;
        }
        if(sum>input){
            count--;
            sum = sum-1;
        }
        System.out.println(count);



    }
}
