package com.example.portal.core;

import lombok.AllArgsConstructor;

public record StandardDomainObjectType(String name) implements DomainObjectType {
    public static StandardDomainObjectType create(String name) {
        return new StandardDomainObjectType(name);
    }
}

