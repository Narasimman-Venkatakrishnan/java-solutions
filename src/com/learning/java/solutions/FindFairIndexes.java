package com.learning.java.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindFairIndexes {

    static void findSplitPoints(int A[], int B[], int n) {

        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i < n; i++) {

            int leftSum_A = arraySum(Arrays.copyOfRange(A, 0, i));
            int rightSum_A = arraySum(Arrays.copyOfRange(A, i, n));

            int leftSum_B = arraySum(Arrays.copyOfRange(B, 0, i));
            int rightSum_B = arraySum(Arrays.copyOfRange(B, i, n));

            if (leftSum_A == rightSum_A && leftSum_B == rightSum_B && leftSum_A == leftSum_B) {
                resultList.add(i);
            }
        }
        System.out.println("Fair indexs  : " + resultList);
    }

    static int arraySum(int[] list) {

        return Arrays.stream(list).reduce(0, (subtotal, element) -> subtotal + element);
    }

    public static void main(String[] args) {

        //int A[] = {4,-1,0,3};
        //int B[] = {-2,6,0,4};

        int A[] = {4, -1, 0, 3};
        int B[] = {-2, 5, 0, 3};
        findSplitPoints(A, B, A.length);
    }
}
