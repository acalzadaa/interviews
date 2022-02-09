package com.alex;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
given an array with numbers, find the ones that are unique

example:

given
final var aBunchOfNumbers = new double[]{1, 3.5, 1, 2, 1, 1})

return
[3.5, 2]

 */

public class FindTheUniqueNumbers
{
    public static void main(String[] args)
    {
        final var aBunchOfNumbers = new double[]{1, 3.5, 1, 2, 1, 1};
        final var uniqueNumbers = findUniq(aBunchOfNumbers);
        Arrays.stream(uniqueNumbers).map(Object::toString).forEach(System.out::println);
    }

    public static Object[] findUniq(double[] arr) {

        final var mappedDoubles = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return mappedDoubles.entrySet().stream().filter( r -> r.getValue() == 1).map(Map.Entry::getKey).toArray();

    }
}