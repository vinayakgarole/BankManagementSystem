package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a Java program to find the intersection of two arrays ,result should store in a temp array'
 */
public class Intersection {

    private int[] arr1;
    private int[] arr2;

    public Intersection(int[] a, int[] b) {
        this.arr1 = a;
        this.arr2 = b;
    }

    public int[] findIntersection() {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {

                    if (!temp.contains(arr1[i])) {
                        temp.add(arr1[i]);
                    }
                }
            }
        }

        int[] result = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }


    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        Intersection intersection = new Intersection(a, b);
        int[] result = intersection.findIntersection();
        System.out.println("Intersection of Arrays: " + Arrays.toString(result));
    }
}
