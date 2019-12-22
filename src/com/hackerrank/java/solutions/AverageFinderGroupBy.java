package com.hackerrank.java.solutions;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

/* Finding the average score from the list grouping by student name  */

public class AverageFinderGroupBy {
    public static void main(String[] args) {

        String[][] scores = { { "Simma", "70" }, { "Raghu", "60" }, { "Lakshmi", "70" }, { "Lakshmi", "100" },{ "Raghu", "100" } };

        double highestAvg = Arrays.stream(scores)
                                  .collect(groupingBy(s -> s[0], averagingInt(s -> parseInt(s[1]))))
                                  .values()
                                  .stream()
                                  .max(naturalOrder())
                                  .get();

        System.out.println(highestAvg);
    }
}
