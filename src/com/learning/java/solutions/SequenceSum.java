package com.learning.java.solutions;

import java.util.stream.IntStream;

    /* Sequence sum i to j and back to k ; i ---> j ----> k
         ex: i=1, j=5 and k=1 then sum = (1) + 2 + 3 + 4 + (5) + 4 + 3 + 2 + (1)  */

public class SequenceSum {

    public static void main(String[] args)
    {
        //i = 1 , j = 3, k = -1
        IntStream stream1 = IntStream.rangeClosed(1, 3);
        IntStream stream2 = IntStream.range(-1, 3);
        System.out.println(IntStream.concat(stream1, stream2).reduce(0, (subTotal, element) -> subTotal + element));
    }
}
