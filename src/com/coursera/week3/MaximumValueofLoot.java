package com.coursera.week3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MaximumValueofLoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double weightSum = 0;
        double valueSum = 0;
        int n = s.nextInt();
        int W = s.nextInt();
        int value, weight, index;
        double[][] items = new double[n][2];
        double[] ratio = new double[n];
        double fill = 0;
        for (int i = 0; i < n; i++) {
            value = s.nextInt();
            weight = s.nextInt();
            items[i][0] = value;
            items[i][1] = weight;
            ratio[i] = (double) value / (double) weight;
        }
        double[] newRatio = sort(ratio);
        for (int i = 0; i < newRatio.length; i++) {
            index = findIndex(newRatio[i], ratio);
            weightSum = weightSum + items[index][1];
            if (weightSum > W) {
                fill = items[index][1] - (weightSum - W);
                weightSum = weightSum - items[index][1] + fill;
                valueSum = valueSum + fill * newRatio[i];
            } else if (weightSum <= W) {
                valueSum = valueSum + items[index][0];
            }


        }
        DecimalFormat d = new DecimalFormat("#.0000");
        System.out.println(d.format(valueSum));
//        BigDecimal b =new BigDecimal(valueSum);
//        double result =b.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
//        System.out.println(result);
//        double[] input = new double[]{1.2354, 45.1656, 454545.1};
//        System.out.println(findIndex(454545.1,input));
    }

    public static double[] sort(double[] ratio) {
        double[] input = new double[ratio.length];
        for (int i = 0; i < ratio.length; i++) {
            input[i] = ratio[i];
        }
        double temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[i] < input[j]) {
                    temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }
        return input;
    }

    public static int findIndex(double d, double[] input) {
        int i = 0;
        while (i <= input.length) {
            if (d == input[i]) {
                return i;
            }
            i++;
        }
        return i;
    }
}
