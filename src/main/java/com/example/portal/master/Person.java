package com.example.portal.master;

import lombok.Value;

@Value
public class Person {
    String name;
    public static Person create(){ return new Person("");}
}
