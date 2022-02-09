package com.alex.awesome;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOddRepeatedNames
{
    /*
    From a given list of names
    return a list of names
    that are repeated an odd (like 1,3,5,etc) quantity of times

    for example:
    give a list composed by: "Tim", "John", "John", "Adam", "Adam", "Adam"
    your method must return: "Tim", "Adam"
    */

    /*
    here's some convenience data to test this exercise:

    "Derren", "Tyra", "Killian", "Ayomide", "Myrtle", "Derren", "Heena", "Aqeel",
    "Killian", "Cassian", "Ameerah", "Cassian", "Myrtle", "Heena", "Pheobe", "Killian",
    "Aqeel",  "Aqeel",  "Derren", "Pheobe", "Derren", "Ameerah", "Cassian", "Pheobe",
    "Tyra",  "Heena", "Heena", "Karl", "Pheobe", "Derren"
     */

    public static void main(String[] args)
    {
        final var names = List.of("Derren", "Tyra", "Killian", "Ayomide", "Myrtle", "Derren", "Heena", "Aqeel",
                "Killian", "Cassian", "Ameerah", "Cassian", "Myrtle", "Heena", "Pheobe", "Killian",
                "Aqeel", "Aqeel", "Derren", "Pheobe", "Derren", "Ameerah", "Cassian", "Pheobe",
                "Tyra", "Heena", "Heena", "Karl", "Pheobe", "Derren");

        final var namesRepeatedOddNumberOfTimes = getListOfNamesRepeatedOddNumberOfTimes(names);
        System.out.println(namesRepeatedOddNumberOfTimes);
    }

    public static List<String> getListOfNamesRepeatedOddNumberOfTimes(List<String> names)
    {
        if (names.isEmpty())
        {
            return List.of();
        }

        final var namesWithRepeats = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        final var namesWithOddRepeats = namesWithRepeats.entrySet().stream().filter(r -> r.getValue() % 2 != 0);
        return namesWithOddRepeats.map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
