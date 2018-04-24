package com.codecool.cyclicRotationWithArray;

public class Solution {

    public static int[] solution(int[] A, int K){
        int position;
        int[] result = new int[A.length];

        for(int i=0; i < A.length; i++) {
            position = i + K;
            while(position >= A.length) {
                position -= A.length;
            }
            result[position] = A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] rotated = solution(arr, 4);

        for (int numb: rotated) {
            System.out.println(numb);
        }
    }
}
