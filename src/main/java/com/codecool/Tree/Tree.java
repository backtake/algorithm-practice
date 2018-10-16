package com.codecool.Tree;

public class Tree {

    public static void main(String[] args) {
        christmasTree(7);
    }

    private static void christmasTree(int n) {
        printAsterixes(n);
    }

    private static void printAsterixes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void printAsterixesDiffrentWay(int n) {

    }
}
