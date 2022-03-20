package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arraylist = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        for (int i = 0;i < 50;i++) {
            arraylist.add(random.nextInt(100) + 1);
        }
        for (int i:arraylist) {
            if (i % 2 == 0) {
                evenNumber.add(i);
            }
            else oddNumber.add(i);
        }
        System.out.println("Even numbers are: ");
        print(evenNumber);
        System.out.println("\nOdd numbers are: ");
        print(oddNumber);
    }
    public static void print(ArrayList<Integer> array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
