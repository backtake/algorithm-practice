package com.codecool.maxCounters;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        int[] result = solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});

        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] solution(int N, int[] A) {

        int[] result = new int[N];
        int lengthOfA = A.length;

        for (int i=1; i<=lengthOfA; i++) {
            if (A[i-1]>=1 && A[i-1]<=N) {
                result[A[i-1]-1]++;
            }
            if (A[i-1]==N+1) {
                int ourMax = Arrays.stream(result).max().getAsInt();
                result = Arrays.stream(result).map(x -> ourMax).toArray();
            }
        }
        return result;
    }
}
