package com.example.portal.core;

public record DomainRoutes(String name) implements Contract {
    public static DomainRoutes create(String name) {return new DomainRoutes(name);}
}
