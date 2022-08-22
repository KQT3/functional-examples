package com.example.portal.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface MyMath {
    static int add(Integer x, Integer y) {
        return x + y;
    }

    static int subtract(Integer x, Integer y) {
        return x - y;
    }

    static Integer combine(BiFunction<Integer, Integer, Integer> combineFunc) {
        return combineFunc.apply(2, 3);
    }

    static Function<Integer, Double> createMultiplier(Integer y) {
        return (Integer x) -> Double.valueOf(x * y);
    }

    static BiFunction<Integer, String, Double> createMultiplier2x(Integer y) {
        return (number, text) -> {
            System.out.println(text);
            System.out.println("number = " + number);
            System.out.println("y = " + y);
            return Double.valueOf(number * y);
        };
    }

}
