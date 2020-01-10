package com.learning.java.solutions;

    /*
    There are N bulbs, numbered from 1 to N arranged in a row. Bulb number i is wired to bulb number i-1 and first bulb
    is connected to power socket. Initially all bulbs are OFF and then we turn the bulbs ON according to a given array
    (explained in following example). A bulb shines if it is ON and all previous bulbs are ON already.
    We need to find number of moments for which every turned ON bulb shines

    for e.g. Given array [2, 1, 3, 5, 4] we should get answer 3 as follows:

    First, we turn bulb 2 ON but bulb 1 is OFF
    Then, we turn bulb 1 ON and there is no bulb left to it (So, first moment)
    Then, we turn bulb 3 ON and bulbs 1 & 2 are already ON (So, second moment)
    Then, we turn bulb 5 On but bulb 4 is OFF
    Then, we turn bulb 4 ON and bulbs 1, 2, 3 are already ON (So, third moment)
    N is an integer withing range [1, 100000]; All elements of A are distinct; Each element of the given array is an integer in range [1, N]
    */

public class BulbShine {

    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};

        int counter = 0;

        int sum = 0;

        int listsum = 0;

        for(int i = 0 ; i < arr.length; i++ ){
            sum += (i +1);
            listsum += arr[i];
            if(sum == listsum){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
