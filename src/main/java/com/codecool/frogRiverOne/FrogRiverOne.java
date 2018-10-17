package com.codecool.frogRiverOne;

import java.util.Set;
import java.util.HashSet;

public class FrogRiverOne {

    public static void main(String[] args) {
        int[] A = new int[]{4,3,1,5,2,4,3,4};
        System.out.println(solution(5, A));
    }

    private static int solution(int X, int[] A) {
        Set<Integer> uniques = new HashSet<>();

        for(int i=0; i<A.length; i++) {
            uniques.add(A[i]);
            if (uniques.size()==X) {
                return i;
            }
        }
        return -1;
    }
}
