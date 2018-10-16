package com.codecool.oddOccurrencesInArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int solution(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = A.length;
        int number;
        int result = 0;

        for (int i=0; i < len; i++) {
            number = A[i];

            if (map.containsKey(number)) {
                map.replace(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue()%2 != 0) {
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,1,4};
        System.out.println(solution(arr));

    }
}
