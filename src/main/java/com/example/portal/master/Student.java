package com.example.portal.master;

import com.example.portal.core.*;
import lombok.Builder;

@Builder
public record Student(Identifier id, Version version, String name, int age) implements DomainObject {
    public static final String STUDENT = "STUDENT";
    public static final DomainObjectType STUDENT_TYPE = DomainObjectType.fromContract(Contracts.STUDENT);

    public static Student create(String name, int age){
        return new Student(Identifier.create(), Version.create(), name, age);
    }
    @Override
    public DomainObjectType getDomainObjectType() {return STUDENT_TYPE;}
}
