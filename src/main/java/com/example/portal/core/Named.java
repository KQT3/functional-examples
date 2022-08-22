package com.example.portal.core;

import java.util.Objects;

public interface Named {
    String name();

    default boolean sameName(Named named) {
        if (named == null) return false;
        return Objects.equals(name(), named.name());
    }

    default boolean startsWith(String name) {
        return name().startsWith(name);
    }
}
