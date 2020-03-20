package com.learning.java.solutions;

public class MinStepsToReduce {
    public static void main(String args[]) {
        MinStepsToReduce t = new MinStepsToReduce();
        System.out.println(t.solution("011100"));
    }

    int solution(String S) {
        return getStep(Integer.parseInt(S, 2), 0);
    }

    private int getStep(int question, int count) {
        if (question == 0) {
            return count;
        }
        count++;

        if (question % 2 == 0) {
            return getStep(question / 2, count);
        } else {
            return getStep(question - 1, count);
        }
    }
}
