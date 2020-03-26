package com.company;

import java.util.Arrays;
import java.util.Random;

public class NumberSet {
    public static int maxSize=100;
    private int[] nSet = new int[maxSize];
    private  int size=0;

    /** Metoda dodaje liczbę do zbioru liczb (zezwalamy na dodanie just istniejącej liczby)
     *  @param i - liczba, którą dodajemy
     *  @throws Exception - występuje w przypadku przepełnienia zbioru
     */
    public void add(int i) throws Exception{
        assert (this.nSet != null) : "Zbiór nie został utworzony!";
        assert (Integer.class.isInstance(i)) : "Błędny typ zmiennej i";
        assert (maxSize>0) : "Maksymalna liczba elementów mniejsza niż 0";
        if(size>=maxSize)
            throw new Exception("Wystąpiło przepełnienie zbioru przy próbie dodania!");
        else {
            nSet[size] = i;
            size += 1;
        }
    }

    /** Metoda usuwa liczbę ze zbioru (każde wystąpienie)
     *  @param liczba - liczba do usunięcia
     *  @throws Exception - występuje, jeśli zbiór nie posiada liczby którą chcemy usunąć
     */
    public void remove(int liczba) throws Exception{
        assert (this.size < maxSize) : "Wystąpiło przepełnienie zbioru!";
        assert (this.nSet != null) : "Zbiór nie został utworzony!";
        assert (Integer.class.isInstance(liczba)) : "Błędny typ zmiennej liczba";
        assert (this.size != 0) : "Zbiór pusty!";
        assert (maxSize>0) : "Maksymalna liczba elementów mniejsza niż 0";
        int[] temp = new int[maxSize];
        int j=0;
        boolean flaga;
        for (int i=0;i<size;i++) {
            if (nSet[i]!=liczba) {
                temp[j] = nSet[i];
                j++;
            }
        }
        if (j==size)
            throw new Exception("nie znaleziono liczby do usunięcia w zbiorze");
        nSet=temp;
        size=nSet.length;
    }

    /** Metoda losuje jedną liczbę ze zbioru oraz ją usuwa
     *  @return - wylosowana liczba
     *  @throws Exception - występuje, jeśli zbiór jest pusty
     */
    public int getRandomValue() throws Exception{
        assert (this.size < maxSize) : "Wystąpiło przepełnienie zbioru!";
        assert (this.nSet != null) : "Zbiór nie został utworzony!";
        assert (maxSize>0) : "Maksymalna liczba elementów mniejsza niż 0";
        if(this.size == 0)  throw new Exception("Zbiór pusty!");
        Random generator = new Random();
        int random = generator.nextInt(size);
        int number=nSet[random];
        for (;random>=size;random++)
            nSet[random]=nSet[random+1];
        return number;
    }

//--------------------------------

    /** Metoda zwraca sumę podanych elementów d
     *  @return - suma liczb
     *  @throws Exception - występuje, jeśli zbiór jest pusty
     */
    public int getSumOfElements() throws Exception{
        assert (this.size < maxSize) : "Wystąpiło przepełnienie zbioru!";
        assert (this.nSet != null) : "Zbiór nie został utworzony!";
        assert (maxSize>0) : "Maksymalna liczba elementów mniejsza niż 0";
        if(this.size == 0)  throw new Exception("Zbiór pusty!");
        assert(size<=0);
        int suma=0;
        for (int liczba:nSet)
            suma+=liczba;
        return suma;
    }

    /** Metoda dzieli każdy element zbioru przez podaną wartość bez reszty
     *   @param d - liczba, przez którą dzielimy
     *   @throws Exception - występuje w przypadku dzielenia przez 0 (można zastąpić asercją)
     */
    public void divideAllElementsBy(int d) throws Exception{
        assert (this.size < maxSize) : "Wystąpiło przepełnienie zbioru!";
        assert (this.nSet != null) : "Zbiór nie został utworzony!";
        assert (maxSize>0) : "Maksymalna liczba elementów mniejsza niż 0";
        assert (this.size != 0) : "Zbiór pusty!";
        assert(size<=0);
        assert (d!=0);

        for(int i=0;i<size;i++)
            nSet[i]=nSet[i]/d;
    }

    /** Metoda sprawdza, czy w zbiorze istnieje podany element
     *   @param i - element do sprawdzenia
     *   @return true w przypadku odnalezienia wartości, false w przeciwnym razie
     */
    public boolean contains (int i){
        assert (this.size < maxSize) : "Wystąpiło przepełnienie zbioru!";
        assert (this.nSet != null) : "Zbiór nie został utworzony!";
        assert (maxSize>0) : "Maksymalna liczba elementów mniejsza niż 0";
        assert (this.size != 0) : "Zbiór pusty!";
        assert(size<=0);

        for (int liczba:nSet) {
            if(liczba==i)
                return true;
        }
        return false;
    }

    /** Metoda zwraca rozmiar zbioru (liczbę elementów)
     *  @return - rozmiar zbioru
     */
    public int getSize(){
        assert (this.size < maxSize) : "Wystąpiło przepełnienie zbioru!";
        assert (this.nSet != null) : "Zbiór nie został utworzony!";
        assert (maxSize>0) : "Maksymalna liczba elementów mniejsza niż 0";
        assert (this.size != 0) : "Zbiór pusty!";
        assert(size<=0);
        return size;
    }

    @Override
    public String toString() {
        return nSet.toString();
    }
    /** Pozwala sprawdzić wartości w tablicy
     */
    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print(i + ":" + nSet[i]+", ");
        }
        System.out.println();
    }
}
