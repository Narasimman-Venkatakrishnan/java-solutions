package com.learning.java.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/* Sorting string in Lexicographical order  */

public class Lexicographical {

    /* The program will produce output as following "Hac->Hack->Hacker->HackerRank"  */

    public static void main(String[] args) {
        String[] words = { "HackerRank", "Hack", "Hacker", "Hac" };
        Comparator<String> nameComparator = (s1, s2) -> s1.compareTo(s2);
        System.out.println(Arrays.stream(words).sorted(nameComparator).collect(Collectors.joining("->")));
    }
}
