package com.codecool.tapeEquilibrium;

import java.util.Arrays;

public class MyRun implements Runnable {
    private int split;
    private int[] a;
    private int value;

    public MyRun(int i, int[] a) {
        this.split=i;
        this.a=a;
    }

    @Override
    public void run() {
        value = Math.abs(Arrays.stream(a,0,split).sum()-Arrays.stream(a,split,a.length).sum());
    }

    public int getValue() {
        return value;
    }
}
