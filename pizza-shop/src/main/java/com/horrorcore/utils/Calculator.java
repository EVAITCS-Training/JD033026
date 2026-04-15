package com.horrorcore.utils;

public class Calculator {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int... a) {
        int result = 0;
        for (int num : a) {
            result += num;
        }
        return result;
    }

    public static double add (double a, double b) {
        return a + b;
    }
}
