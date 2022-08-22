package com.example.portal.core;

import java.util.UUID;

public record Version(UUID version) {
    public static Version create() {return new Version(UUID.randomUUID());}
}
