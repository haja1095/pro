package com.kgisl.qs1;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

/**
 * 
 * Exocurrences
 * 
 */

public class Demo {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(5);

        list1.add(11);

        list1.add(23);

        list1.add(5);

        System.out.println("the numbers are:");

        for (int var : list1) {

            System.out.println(var);

        }

        System.out.println("number 5 occurunces");

        int a = Collections.frequency(list1, 5);

        System.out.println(a);

        System.out.println("number 11 occurences");

        int b = Collections.frequency(list1, 11);

        System.out.println(b);

        System.out.println("number 23 occurunces");

        int c = Collections.frequency(list1, 23);

        System.out.println(c);

    }

}