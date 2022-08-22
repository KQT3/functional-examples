package com.example.portal.core;

public interface Contract extends Named {
    static Contract subject(String name) {
        return new SubjectContract(name);
    }
}
