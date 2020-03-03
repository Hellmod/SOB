package com.company;

import java.util.Arrays;
import java.util.Random;

public class NumberSet {
    public static int maxSize=100;
    private int[] nSet = new int[maxSize];
    private  int size=0;

    public void add(int i) throws Exception{
        assert (size<maxSize): "Overflow table";
        nSet[size]=i;
        size+=1;
    }

    public void remove(int liczba) throws Exception{
        int[] temp = new int[maxSize];
        int j=0;
        boolean flaga;
        for (int i=0;i<size;i++) {
            if (nSet[i]!=liczba) {
                temp[j] = nSet[i];
                j++;
            }
        }
        assert (j!=size):"no number found";
        nSet=temp;
        size=nSet.length;
    }

    public int getRandomValue() throws Exception{
        assert(size<=0);
        Random generator = new Random();
        int random = generator.nextInt(size);
        int number=nSet[random];
        for (;random>=size;random++)
            nSet[random]=nSet[random+1];
        return number;
    }

    public int getSumOfElements() throws Exception{
        assert(size<=0);
        int suma=0;
        for (int liczba:nSet)
            suma+=liczba;
        return suma;
    }

    public void divideAllElementsBy(int d) throws Exception{
        assert (d!=0);
        for(int i=0;i<size;i++)
            nSet[i]=nSet[i]/d;
    }

    public boolean contains (int i){
        for (int liczba:nSet) {
            if(liczba==i)
                return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return nSet.toString();
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print(i + ":" + nSet[i]+", ");
        }
        System.out.println();
    }
}
