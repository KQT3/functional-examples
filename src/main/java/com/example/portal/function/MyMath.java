package com.example.portal.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

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
        return x -> Double.valueOf(x * y);
    }

    static BiFunction<Integer, String, Double> createMultiplier2x(Integer y) {
        return (number, text) -> {
            System.out.println(text);
            System.out.println("number = " + number);
            System.out.println("y = " + y);
            return Double.valueOf(number * y);
        };
    }

    static BiFunction<Float, Float, Float> divide() {
        return (x, y) -> x / y;
    }

    static Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsNotZeroCheck() {
        return func -> (x, y) -> {
            if (y == 0f) {
                System.out.println("ERROR");
                return 0f;
            }
            return func.apply(x, y);
        };
    }

    BiFunction<Float, Float, Float> divideSafe = secondArgIsNotZeroCheck().apply(divide());

    /*-----------------------------------------------------------------------------------------------------------------*/
    interface Alternative {
        static BinaryOperator<Float> alternativeDivide() {
            return (x, y) -> x / y;
        }

        static UnaryOperator<BinaryOperator<Float>> alternativeSecondArgIsNotZeroCheck() {
            return func -> (x, y) -> {
                if (y == 0f) {
                    System.out.println("ERROR");
                    return 0f;
                }
                return func.apply(x, y);
            };
        }

        BinaryOperator<Float> alternativeDivideSafe =
                MyMath.Alternative.alternativeSecondArgIsNotZeroCheck().apply(MyMath.Alternative.alternativeDivide());
    }
    /*-----------------------------------------------------------------------------------------------------------------*/
}
