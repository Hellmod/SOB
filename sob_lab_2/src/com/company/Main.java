package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        try {
            test9();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void test1() throws Exception {
        NumberSet nSet = new NumberSet();
        Random generator = new Random();
            for (int i = 1; i <=100 ; i++)
                nSet.add(generator.nextInt(5));
            nSet.print();
            nSet.add(2);
    }

    static void test2() throws Exception {
        NumberSet nSet = new NumberSet();
        Random generator = new Random();
        nSet.maxSize=-5;
            for (int i = 1; i <=100 ; i++)
                nSet.add(generator.nextInt(5));
            nSet.print();
            nSet.add(2);
    }

    static void test3() throws Exception {
        NumberSet nSet = new NumberSet();
        nSet.add(5);
    }

    static void test4() throws Exception {
        NumberSet nSet = new NumberSet();
        Random generator = new Random();
        for (int i = 1; i <=10 ; i++)
            nSet.add(generator.nextInt(5));
        nSet.maxSize=5;
    }

    static void test5() throws Exception {
        NumberSet nSet = new NumberSet();
        System.out.println(nSet.getRandomValue());
    }

    static void test6() throws Exception {
        NumberSet nSet = new NumberSet();
        System.out.println(nSet.getSumOfElements());
    }

    static void test7() throws Exception {
        NumberSet nSet = new NumberSet();
        nSet.divideAllElementsBy(0);
    }

    static void test8() throws Exception {
        NumberSet nSet = new NumberSet();
        nSet.contains(0);
    }

    static void test9() throws Exception {
        NumberSet nSet = new NumberSet();
        nSet.getSize();
    }
}

