package com.codecool.Fibonnaci;


public class Fibonnaci {

    public static void main(String[] args) {
        counterForFibonnaci(10, 1000000000);

    }

    private static void counterForFibonnaci(int a, int b) {
        int k = 0;

        for (int i = 1; fibonnaci(i) < b; i++) {
            if (fibonnaci(i) > a) k++;
        }

        System.out.println("Pomiedzy " + a + ", a " + b + " jest " + k + " liczb");
    }

    private static int fibonnaci(int n) {
        if (n<=1) {
            return 1;
        } else {
            return fibonnaci(n-1) + fibonnaci(n-2);
        }
    }
}
