package com.learning.java.solutions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShortestSubString {

    static String findShortestSubstr(String str, int k)
    {
        int n = str.length();
        int st = 0;
        int end = 0;

        int cnt[] = new int[26];

        for (int i = 0; i < 26; i++) {
            cnt[i] = 0;
        }
        int distEle = 0;
        int currlen;
        int minlen = n;
        int startInd = -1;
        while (end < n) {
            cnt[str.charAt(end) - 'a']++;
            if (cnt[str.charAt(end) - 'a'] == 1) {
                distEle++;
            }
            if (distEle > k) {
                while (st < end && distEle > k) {
                    if (cnt[str.charAt(st) - 'a'] == 1) {
                        distEle--;
                    }
                    cnt[str.charAt(st) - 'a']--;
                    st++;
                }
            }

            if (distEle == k) {
                while (st < end && cnt[str.charAt(st) - 'a'] > 1) {
                    cnt[str.charAt(st) - 'a']--;
                    st++;
                }
                currlen = end - st + 1;
                if (currlen < minlen) {
                    minlen = currlen;
                    startInd = st;
                }
            }
            end++;
        }

        return str.substring(startInd, startInd + minlen);
    }

    public static void main(String args[]) {
        String s = "lakshminarasimmanvenkatakrishnanlakshminrvet";
        int k = Arrays.stream(s.split("")).distinct().collect(Collectors.joining("")).length();
        String shortest_substr = findShortestSubstr(s, k);
        System.out.println("The shortest substring is: " + shortest_substr);
    }
}
