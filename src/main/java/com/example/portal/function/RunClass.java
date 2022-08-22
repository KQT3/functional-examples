package com.example.portal.function;

public class RunClass {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction
                = (integer, integer2, integer3) -> integer + integer2 + integer3;

        Integer apply = triFunction.apply(10, 30, 40);
        System.out.println(apply);
    }
}
