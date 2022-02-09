package com.alex;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatNWordsByLength
{
    /*
    Given an unsorted list of unique words, create a string concatenating N words ordered by length from longest to shortest

    f.e

    given: one, lemon, minute, is, moon
    and: a number 3
    you should return: minutelemonmoon

    given: sun, hour, masked, go, I, seven
    and: a number 2
    you should return: maskedseven

     */

    public static void main(String[] args)
    {
        final var listOfWords = List.of("Rain", "Elegant", "Marsupial", "Root", "Sea", "Fish", "Volcanoes");
        final var listOrArrayWords = new String[]{"Rain", "Elegant", "Marsupial", "Root", "Sea", "Fish", "Volcanoes"};

        final var result = concatNConsecutiveStringsUsingMap(listOfWords, 2);
        System.out.println(result);

        final var resultUsingArrays = concatNConsecutiveStringsUsingMapAndArrays(listOrArrayWords, 2);
        System.out.println(resultUsingArrays);

        final var resultUsingSort = concatNConsecutiveStringsUsingSort(listOfWords, 2);
        System.out.println(resultUsingSort);
    }

    private static String concatNConsecutiveStringsUsingSort(List<String> listOfWords, int i)
    {
        return listOfWords.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(i)
                .collect(Collectors.joining(""));
    }

    private static String concatNConsecutiveStringsUsingMapAndArrays(String[] listOrArrayWords, int i)
    {
        final var mapWithLengths = Stream.of(listOrArrayWords).collect(Collectors.toMap(Function.identity(), String::length));

        final var mapWithLengthsSorted = mapWithLengths.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> v, LinkedHashMap::new));

        return mapWithLengthsSorted.entrySet().stream()
                .limit(i)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(""));
    }

    private static String concatNConsecutiveStringsUsingMap(List<String> listOfWords, int i)
    {
        final var mapWithLengths = listOfWords.stream().collect(Collectors.toMap(Function.identity(), String::length));
        final var mapWithLengthsSorted = mapWithLengths.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> v, LinkedHashMap::new));

        return mapWithLengthsSorted.entrySet().stream()
                .limit(i)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(""));
    }
}
