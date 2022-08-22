package com.example.portal.core;

import java.util.Objects;

public interface DomainObject {
    Identifier id();
    Version version();
    DomainObjectType getDomainObjectType();

    default boolean sameId(Identifier identifier) {return Objects.equals(id(), identifier);}

    default <D extends DomainObject> D as() {return (D) this;}
}
