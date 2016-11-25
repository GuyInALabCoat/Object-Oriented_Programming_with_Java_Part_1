package com.company;

import java.util.*;

public class Week4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4); list1.add(3);
        list2.add(5); list2.add(10); list2.add(7); list2.add(4); list2.add(3);

        smartCombine(list1, list2);

        System.out.println(list1);
        System.out.println(list2);


    }

    private static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        first.addAll(second);
    }

    private static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        for (int i: second) {
            if (!first.contains(i)){
                first.add(i);
            }
        }
    }
}

