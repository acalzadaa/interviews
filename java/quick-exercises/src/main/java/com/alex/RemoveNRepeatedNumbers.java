package com.alex;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveNRepeatedNumbers
{
    /*

    given an ARRAY of unsorted integers, remove the digits repeated N times, where N is an integer.

    f.e
    given: 6,3,77,1,8,3,6
    and a value: 2
    you should return: 77,1,8

    given: 2,8,8,5,3,44
    and a value: 1
    you should return: 8,8,44

    */

    public static void main(String[] args)
    {
        final var numbers = new int[]{4,9,20,37,20,21,3,1,4};
        final var cleanedNumbers = deleteNRepeated(numbers, 2);

        Arrays.stream(cleanedNumbers).boxed().forEach(System.out::println);

    }

    private static int[] deleteNRepeated(int[] numbers, int i)
    {
        final var referenceMap = Arrays.stream(numbers).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return Arrays.stream(numbers).filter(r -> referenceMap.get(r) != i).toArray();
    }

}
