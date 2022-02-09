package com.alex;

public class FindArmstrongNumber
{

    /*
        An ARMSTRONG number is a number that if each digit is elevated to the N power where N is the number is digits of that number, the result is the original number

        f.e
        123 = 1*1*1 + 2*2*2 + 3*3*3 = 36 is not armstrong
        523 = 5*5*5 + 2*2*2 + 3*3*3 = 523 is armstrong
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634 is armstrong
     */
    public static void main(String[] args)
    {
        final var result = isArmstrong(1634);

        System.out.println(result);
    }

    private static boolean isArmstrong(int i)
    {
        final var resultNumber = String.valueOf(i).chars().map(Character::getNumericValue).mapToDouble(r -> Math.pow(r, String.valueOf(i).length())).sum();
        return i == resultNumber;
    }
}
