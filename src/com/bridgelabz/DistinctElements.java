package com.bridgelabz;


import java.util.ArrayList;
import java.util.List;

/*
 * Write a program to DISPLAY THE DISTINCTELEMENTS between two arrays?
 */
public class DistinctElements {

    int[] arr1 = new int[]{1, 2, 3, 4, 5};
    int[] arr2 = new int[]{4, 5, 6, 7, 8};

    public void distinctElement() {

        boolean contains = false;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    contains = true;
                    break;
                }
            }

            if (!contains) {
                list.add(arr1[i]);
            } else {
                contains = false;
            }
        }
        List<Integer> temp = list;
        System.out.println("Temp: " + temp);
//        System.out.println(list);
    }

    public static void main(String[] args) {

        DistinctElements distinctElements = new DistinctElements();
        distinctElements.distinctElement();
    }
}
