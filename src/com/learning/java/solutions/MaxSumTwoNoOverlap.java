package com.learning.java.solutions;

public class MaxSumTwoNoOverlap {

    public static void main(String[] args)
    {
        MaxSumTwoNoOverlap maxSumTwoNoOverlap = new MaxSumTwoNoOverlap();
        int arr1[] = {6, 1, 4, 6, 3, 2, 7, 4};
        //int arr1[] = {10,19,15};
        System.out.println(maxSumTwoNoOverlap.maxSumTwoNoOverlap(arr1, 2, 2));

    }

    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int[] prefixSum = new int[A.length + 1];
        for (int i = 0; i < A.length; ++i) {
            prefixSum[i + 1] = prefixSum[i] + A[i];
        }
        return Math.max(maxSum(prefixSum, L, M), maxSum(prefixSum, M, L));
    }

    private int maxSum(int[] p, int L, int M) {
        int ans = -1;
        for (int i = L + M, maxL = 0; i < p.length; ++i) {
            maxL = Math.max(maxL, p[i - M] - p[i - M - L]);
            ans = Math.max(ans, maxL + p[i] - p[i - M]);
        }
        return ans;
    }
}
