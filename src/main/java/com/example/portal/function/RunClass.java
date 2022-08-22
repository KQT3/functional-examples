package com.example.portal.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class RunClass {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction
                = (integer, integer2, integer3) -> integer + integer2 + integer3;

        Integer apply = triFunction.apply(10, 30, 40);
        System.out.println(apply);

        System.out.println(MyMath.combine(MyMath::add));
        System.out.println(MyMath.combine(MyMath::subtract));
        System.out.println(MyMath.combine((integer, integer2) -> integer * integer2));

        Supplier<Supplier<String>> createGreeter = () -> () -> "Hello Function";
        Supplier<String> greeter = createGreeter.get();
        System.out.println(greeter.get());

        Function<Integer, Double> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Double> timesThree = MyMath.createMultiplier(3);
        Function<Integer, Double> timesFour = MyMath.createMultiplier(4);
        BiFunction<Integer, String, Double> times2x = MyMath.createMultiplier2x(10);
        Double apply3 = timesTwo.apply(6);
        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));
        System.out.println(timesFour.apply(6));
        System.out.println(times2x.apply(5, "2xString"));
        System.out.println(MyMath.divideSafe.apply(10f, 1f));

        Float apply1 = MyMath.secondArgIsNotZeroCheck().apply(MyMath.divide()).apply(1f,4f);
        System.out.println(apply1);

        BiFunction<Float, Float, Float> apply2 = MyMath.secondArgIsNotZeroCheck().apply(MyMath.divide());
    }

}
