package com.example.portal.function;

import lombok.SneakyThrows;

public class Recursion {
    @SneakyThrows
    public static void countDown(Integer x){
        if(x < 0){
            System.out.println("Done!");
            return;
        }
        System.out.println(x);
        Thread.sleep(1000);
        countDown(x - 1);
    }
    public static void main(String[] args) {
        countDown(20);
    }
}
