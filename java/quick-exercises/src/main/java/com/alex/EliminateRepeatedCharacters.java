package com.alex;

import java.util.Objects;
import java.util.stream.Collectors;

public class EliminateRepeatedCharacters
{

    /* for a given string
    consisting in only lower case letters
    eliminate the REPEATED characters
    and return a string
    with only the UNIQUE ones

    for example:
    input: "aaaabbbccccccddeeeeeefff"
    output: "abcdef"
     */

    public static void main(String[] args)
    {
        final var input = "aaaabbbbbbbccccddeeeeef";

        String output = simplifyString(input);
        System.out.println(output);

    }

    private static String simplifyString(String input)
    {
        return input.chars().mapToObj(Character::toString).collect(Collectors.toSet())
                .stream().map(Objects::toString).collect(Collectors.joining(""));
    }

}
