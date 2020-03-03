package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        NumberSet set = new NumberSet();
        Random generator = new Random();
        assert (set != null);


        try {
            for (int i = 0; i <= 5; i++)
                set.add(generator.nextInt(5));
            set.add(2);
            set.print();
            set.remove(2);
            set.print();
            set.remove(10);
            set.print();
        } catch (Exception e) {
            e.printStackTrace();
        }





//            set.remove(10);
//            System.out.println();
//            System.out.println();
//            set.print();
//            set.getRandomValue();
//            set.print();
//            set.getSumPfElements();
//            set.print();
//            set.divideAllElementsBy(2);
//            set.print();
//            set.contains(2);




    }
}

