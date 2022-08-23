package com.example.portal.function;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.function.*;

public class MainFunction {
    public static void main(String[] args) throws IOException, URISyntaxException {
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

        /*--------------------------------------------------------------------------------------------------------------*/
        Float apply1 = MyMath.secondArgIsNotZeroCheck().apply(MyMath.divide()).apply(1f, 4f);
        System.out.println(apply1);

        BiFunction<Float, Float, Float> apply2 = MyMath.secondArgIsNotZeroCheck().apply(MyMath.divide());

        Float apply4 = MyMath.Alternative.alternativeDivide().apply(10f, 2f);
        System.out.println(apply4);

        /*--------------------------------------------------------------------------------------------------------------*/

        TriFunction<Integer, Integer, Integer, Integer> add = (arg1, arg2, arg3) -> arg1 + arg2 + arg3;

        BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial =
                (integer1, integer2) -> (integer3) -> add.apply(integer1, integer2, integer3);

        //adds first and second integer
        Function<Integer, Integer> add5n6 = addPartial.apply(5, 6);

        System.out.println(add5n6.apply(10));

        /*--------------------------------------------------------------------------------------------------------------*/

    }
}
