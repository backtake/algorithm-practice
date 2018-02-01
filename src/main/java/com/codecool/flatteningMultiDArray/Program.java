package com.codecool.flatteningMultiDArray;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{5,1,0},{2},{9,11}};

        for (int number: flattenArray(array)) {
            System.out.println(number);
        }
    }

    private static ArrayList<Integer> flattenArray(int[][] array) {

        ArrayList<Integer> newArray = new ArrayList<>();

        for (int[] arr: array) {
            for (int number: arr) {
                newArray.add(number);
            }
        }
        return newArray;
    }
}
