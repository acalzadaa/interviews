package com.alex;

public class Fibonacci
{
    /*
        For a given "x" that's more than zero and it's integer
        calculate the its fibonacci number

        fibonacci algorithm:

        if: n <= 1
            return n
        else:
            return F(n-1) + F(n-2)

     */
    public static void main(String[] args)
    {
        Integer fibo = fibonacci(4);
        System.out.println(fibo);
    }

    public static Integer fibonacci(int x)
    {
        if(x <= 1){
            return x;
        }

        return fibonacci(x-1) + fibonacci(x-2);
    }
}


