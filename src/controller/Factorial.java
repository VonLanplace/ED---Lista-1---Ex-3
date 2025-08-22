package controller;

public class Factorial {
    public int factorial(int num)
    {
        // The loop stops if the value is lower than 2
        if (num < 2)
            return 1;
        // To write the function all you need is to
        // subtract on the next call
        return num * factorial(num - 1);
    }
}
