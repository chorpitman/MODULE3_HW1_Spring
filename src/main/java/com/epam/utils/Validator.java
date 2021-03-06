package com.epam.utils;

public final class Validator {

    private Validator() {
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("mistake: parameter can not be null");
        }
    }

    public static void checkExpression(boolean expression, String msg) {
        if (expression) {
            throw new IllegalArgumentException("mistake parameter: " + msg);
        }
    }

    public static long greaterThan(int number) {
        if (number > 1) {
            return number;
        } else {
            return 0;
        }
    }

}