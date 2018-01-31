package com.codecool.tinkerTailor;

public class TinkerTailor {

    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        System.out.println("Person " + getWinner(n,k) + " wins.");
    }

    public static int getWinner(int n, int k){

        if (n == 1) {
            return 1;
        } else if (n > 1) {
            return ((getWinner(n-1, k) + k-1) % n) + 1;
        }
        return 0;
    }

}
