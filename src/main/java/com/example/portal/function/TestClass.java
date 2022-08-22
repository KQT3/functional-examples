package com.example.portal.function;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestClass implements MyInterface {
    @Override
    public <D> TestClass studentConsumer(Supplier<D> supplier, Consumer<D> consumer) {
        D d = supplier.get();
        consumer.accept(d);
        return this;
    }
}
