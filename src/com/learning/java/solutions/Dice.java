package com.learning.java.solutions;

public class Dice {

    public static int rollDiceSolution(int[] nums) {
        int min = Integer.MAX_VALUE;
        int[] cnt = new int[7];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i < 7; i++) {
            int rollNum = 0;
            for (int j = 1; j < 7; j++) {
                if (j == i) {
                    continue;
                }
                if (j + i == 7) {
                    rollNum += 2 * cnt[j];
                } else {
                    rollNum += cnt[j];
                }
            }
            min = Math.min(rollNum, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num = new int[] {1, 2, 3};
        System.out.println(rollDiceSolution(num));
        num = new int[] {1, 1, 6};
        System.out.println(rollDiceSolution(num));
        num = new int[] {1, 6, 2, 3};
        System.out.println(rollDiceSolution(num));
    }

}
