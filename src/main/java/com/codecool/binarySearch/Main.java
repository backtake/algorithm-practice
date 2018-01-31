package com.codecool.binarySearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] givenArray = new int[4];

        for (int i=0; i<givenArray.length; i++) {
            System.out.println("Enter number: ");
            givenArray[i] = sc.nextInt();
        }

        BinarySearch binarySearch = new BinarySearch(givenArray);

        System.out.println("Enter value you are looking for: ");

        int value = sc.nextInt();

        if (binarySearch.isNumberInList(value)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
