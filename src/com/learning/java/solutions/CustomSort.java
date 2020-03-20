package com.learning.java.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomSort {

    int arr[] = {11, 4, 2, 7, 6, 3, 10, 12};

    List<Integer> orgArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
    int counter = 0;

    public static void main(String[] args)
    {
        CustomSort customSort = new CustomSort();
        customSort.segregateEvenOdd();
    }

    void segregateEvenOdd() {
        //orgArr.stream().forEach(n -> System.out.print(n + " "));

        List<Integer> indexOddArr = IntStream.range(0, orgArr.size()).boxed().filter(index -> orgArr.get(index) % 2 != 0).collect(Collectors.toList());

        int lenOfOrgArr = orgArr.size();
        int lenOfOddArr = indexOddArr.size();
        int pivot = lenOfOrgArr - lenOfOddArr - 1;

        indexOddArr.stream().filter(index -> index <= pivot).collect(Collectors.toList()).forEach(n -> swap(n));

        System.out.println();
        orgArr.stream().forEach(n -> System.out.print(n + " "));
        System.out.println("Counter : " + counter);
    }

    public void swap(int odd_index) {

        List<Integer> indexEvenArr = IntStream.range(0, orgArr.size()).boxed().filter(index -> orgArr.get(index) % 2 == 0).collect(Collectors.toList());

        int even_index = indexEvenArr.get(indexEvenArr.size() - 1);
        int even_value = orgArr.get(even_index);
        int odd_value = orgArr.get(odd_index);

        orgArr.set(even_index, odd_value);
        orgArr.set(odd_index, even_value);
        counter++;
    }
}
