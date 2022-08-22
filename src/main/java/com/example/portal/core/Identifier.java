package com.example.portal.core;

import java.util.UUID;

public record Identifier(UUID id) {
    public static Identifier create() {return new Identifier(UUID.randomUUID());}
}
