package com.avengers.bruce.Algorithm.basic.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {


    private static void selectionSort(int a[]) {

        int time = 1;

        for (int pos = 0; pos < a.length; pos++) {

            int max = a[pos];
            int maxPos = pos;

            for (int j = pos + 1; j < a.length; j++) {

                if (a[j] > max) {
                    max = a[j];
                    maxPos = j;
                }
            }

            a[maxPos] = a[pos];
            a[pos] = max;

            System.out.println("round "+ time++ +" : "+Arrays.toString(a));

        }
    }

    public static void main(String[] args) {

        int[] array = {1, 3, 9, 10, 2, 7, 8, 6};

        selectionSort(array);

        System.out.println(Arrays.toString(array));

    }


}
