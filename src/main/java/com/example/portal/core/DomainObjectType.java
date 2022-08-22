package com.example.portal.core;

public interface DomainObjectType extends Context.Name{
    static DomainObjectType create(String name){return new StandardDomainObjectType(name);}
    static DomainObjectType fromContract(Contract contract){return new StandardDomainObjectType(contract.name());}
}
