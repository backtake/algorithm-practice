package com.codecool.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] givenArray) {
        Arrays.sort(givenArray);
        this.array = givenArray;
    }

    public boolean isNumberInList(int value) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int middleIndex;

        do  {

            middleIndex = (firstIndex + lastIndex)/2;

            if(array[middleIndex] == value) {
                return true;

            } else if(value < array[middleIndex]) {
                lastIndex = middleIndex - 1;

            } else {
                firstIndex = middleIndex + 1;
            }

        } while (middleIndex!=lastIndex);

        return false;
    }

}
