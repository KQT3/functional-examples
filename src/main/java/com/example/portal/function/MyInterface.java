package com.example.portal.function;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface MyInterface {
    <D> MyInterface studentConsumer(Supplier<D> supplier, Consumer<D> consumer);

}
