package com.codecool;

public class Test {

    public static void main(String[] args) {
        foo(10);
    }

    private static void foo(int numb) {
        for(int i = 1; i<=numb; i++){
            System.out.println(new String(new char[i]).replace("\0", "*"));
        }
    }
}
