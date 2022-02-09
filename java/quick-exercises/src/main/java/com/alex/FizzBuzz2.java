package com.alex;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz2
{
    /*
    For a list of consecutive numbers from 1 to 20
    calculate if they are multiple of 3 and/or 5

    if they are only multiple of 3 return the word FIZZ
    if they are only multiple of 5 return the word BUZZ
    if they are multiple of both 3 and 5 return the word FIZZBUZZ
    if they aren't multiple of neither 3 nor 5 return the number

    collect all the words (and numbers) and return them in a list.

     */

    public static void main(String[] args)
    {
        final var numbers = IntStream.range(1, 21);
        List<String> words = fizzbuzz(numbers);
        System.out.println(words);
    }

    private static List<String> fizzbuzz(IntStream numbers)
    {
        return numbers.boxed().map(r -> r % 3 == 0 && r % 5 != 0 ? "FIZZ" :
                r % 5 == 0 && r % 3 != 0 ? "BUZZ" :
                        r % 5 == 0 && r % 3 == 0 ? "FIZZBUZZ" :
                                r.toString())
                .collect(Collectors.toList());
    }
}
