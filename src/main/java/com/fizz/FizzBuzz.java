package com.fizz;

public class FizzBuzz {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ_BUZZ = "fizzbuzz";

    public static String getNameBy(int number) {
        if (isFizzBuzz(number)) {
            return FIZZ_BUZZ;
        } else if (isFizz(number)) {
            return FIZZ;
        } else if (isBuzz(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isFizz(int number) {
        return (number % 3 == 0 || String.valueOf(number).contains("3"));
    }

    private static boolean isBuzz(int number) {
        return (number % 5 == 0 || String.valueOf(number).contains("5"));
    }

    private static boolean isFizzBuzz(int number) {
        return (isFizz(number) && isBuzz(number));
    }
}
