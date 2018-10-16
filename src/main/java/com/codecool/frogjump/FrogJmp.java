package com.codecool.frogjump;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10,30,30));
    }

    private static int solution(int X, int Y, int D) {
        int result = (Y-X)/D;
        return (result*D<(Y-X)) ? result+1 : result;
    }
}
