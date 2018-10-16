package com.codecool.tapeEquilibrium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        System.out.println(solution(A));
    }

    private static int solution(int[] a) {
        int size = a.length;
        Runnable[] runners = new Runnable[size-1];
        Thread[] threads = new Thread[size-1];
        ArrayList<Integer> results = new ArrayList<>();

        for(int i = 1; i<=size-1; i++) {
            runners[i] = new MyRun(i,a);
        }
        for(int i = 1; i<=size-1; i++) {
            threads[i] = new Thread(runners[i]);
        }
        for(int i = 1; i<=size-1; i++) {
            threads[i].start();
        }
        return Collections.min(results);
    }

}
