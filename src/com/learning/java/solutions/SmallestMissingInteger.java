package com.learning.java.solutions;

import java.util.Arrays;

public class SmallestMissingInteger {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 4, 0, 7};

        SmallestMissingInteger smInt = new SmallestMissingInteger();
        System.out.println(smInt.findSmallestNumber(A));
    }

    public int findSmallestNumber(int[] array) {
        Arrays.sort(array);
        int j, i = 1;
        for (j = 0; j < array.length; j++) {
            if (array[j] == i) {
                i++;
            }
        }
        return i;
    }
}
