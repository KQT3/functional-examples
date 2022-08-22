package com.example.portal.master;

import com.example.portal.core.*;
import lombok.Builder;

@Builder
public record Teacher(Identifier id, Version version, String name) implements DomainObject {
    public static final String STUDENT = "TEACHER";
    public static final DomainObjectType TEACHER_TYPE = DomainObjectType.fromContract(Contracts.TEACHER);

    @Override
    public DomainObjectType getDomainObjectType() {return TEACHER_TYPE;}
}
