package com.coursera.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HugeFibonacci {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        long n = s.nextLong();
//        int m = s.nextInt();
//        int result = 0;
//        List<Integer> remainders = new ArrayList<Integer>();
//        int remainder = 0;
//        int former = 0;
//        int length = 0;
//        int count=0;
//        boolean flag = true ;
//        for (int latter = 0; (latter < n)&&(flag==true);latter++ ) {
//            remainder = fibonacciCount(latter) % m;
//            remainders.add(Integer.valueOf(remainder));
//            if (latter > 0) {
//                while ((remainder == remainders.get(former).intValue())&&flag) {
//
//
//
//                    if (((former + 1) * 2) == (latter + 1)) {
//                        flag = false;
//                        break;
//
//                    }
//                    former++;
//                    latter++;
//                    remainder = fibonacciCount(latter) % m;
//                    remainders.add(Integer.valueOf(remainder));
//
//                }
//
//                if ((((former + 1) * 2) == (latter + 1))&&(remainders.get(former).intValue()==remainders.get(latter).intValue())) {
//                    break;
//                } else {
//                    former = 0;
//                }
//            }
//        }
//        length = former + 1;
//        long yushu = n % length;
//        result = remainders.get((int) yushu);
//        System.out.println(result);
//
//
//    }

//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        long n = s.nextLong();
//        int m = s.nextInt();
//        int remainder;
//        int periodLength = 0;
//        char result;
//        boolean flag=true;
//        int i=0;
//        StringBuffer remainderStr = new StringBuffer();
//        String formerHalf = null, latterHalf = null;
//
//        while(flag){
//            remainder = fibonacciCount(i) % m;
//            remainderStr.append(String.valueOf(remainder));
//            if (i > 0) {
//                if (i % 2 != 0) {
//                    if (remainderStr.charAt((i+1) / 2) == remainderStr.charAt(0)) {
//                        formerHalf = remainderStr.substring(0, (i+1) / 2);
//                        latterHalf = remainderStr.substring((i+1) / 2);
//                        if (formerHalf.equals(latterHalf)) {
//                            flag=false;
//                        }
//                    }
//                }
//                periodLength = (i+1) / 2;
//            }
//            i++;
//
//        }
//
//        int yushu = (int) n % periodLength;
//        result = latterHalf.charAt(yushu);
//        System.out.println(result);
//
//
//    }

//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        long n = s.nextLong();
//        int m = s.nextInt();
//        long remainder;
//        long periodLength = 0;
//        String result;
//        boolean flag = true;
//        int i = 0;
//        List<String> remainderStrs = new ArrayList<String>();
//        List<String> formerHalf = new ArrayList<>();
//        List<String> latterHalf = new ArrayList<>();
//        int count = 0;
//        if (n < m) {
//            remainder = fibonacciCount(n) % m;
//            System.out.println(String.valueOf(remainder));
//        } else {
//
//            while (flag) {
//                remainder = fibonacciCount(i) % m;
//                remainderStrs.add(String.valueOf(remainder));
//                if (i > 0) {
//                    if (i % 2 != 0) {
//                        if (remainderStrs.get((i + 1) / 2).equals(remainderStrs.get(0))) {
//                            formerHalf = remainderStrs.subList(0, (i + 1) / 2);
//                            latterHalf = remainderStrs.subList((i + 1) / 2, i + 1);
//                            for (int index = 0; index < formerHalf.size(); index++) {
//                                if (formerHalf.get(index).equals(latterHalf.get(index))) {
//                                    count++;
//                                }
//                            }
//
//                            if (count == formerHalf.size()) {
//                                flag = false;
//                            }
//                            count = 0;
//                        }
//                    }
//                    periodLength = (i + 1) / 2;
//                }
//                i++;
//            }
//            long yushu = (int) n % periodLength;
//            result = latterHalf.get((int) yushu);
//            System.out.println(result);
//
//
//        }
//    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int m = s.nextInt();
        int remainder;
        long periodLength = 0;
        String result;
        boolean flag = true;
        int i = 0;
        List<String> remainderStrs = new ArrayList<String>();
        List<String> formerHalf = new ArrayList<>();
        List<String> latterHalf = new ArrayList<>();
        int count = 0;
        if (n < m) {
            remainder = fibonacciRemainder(n, m);
            System.out.println(String.valueOf(remainder));
        } else {
            while (flag) {
                remainder = fibonacciRemainder(i, m);
                remainderStrs.add(String.valueOf(remainder));
                if (i > 0) {
                    if (i % 2 != 0) {
                        if (remainderStrs.get((i + 1) / 2).equals(remainderStrs.get(0))) {
                            formerHalf = remainderStrs.subList(0, (i + 1) / 2);
                            latterHalf = remainderStrs.subList((i + 1) / 2, i + 1);
                            for (int index = 0; index < formerHalf.size(); index++) {
                                if (formerHalf.get(index).equals(latterHalf.get(index))) {
                                    count++;
                                }
                            }

                            if (count == formerHalf.size()) {
                                flag = false;
                            }
                            count = 0;
                        }
                    }
                    periodLength = (i + 1) / 2;
                }
                i++;
            }
            int yushu = (int)( n % periodLength);
            result = latterHalf.get(yushu);
            System.out.println(result);


        }


    }

    private static int fibonacciRemainder(long n, int m) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int min = 0, max = 1, result = 0;
            for (long i = 1; i < n; i++) {
                result = (min + max) % m;
                min = max;
                max = result;
            }
            return result;
        }
    }
}
