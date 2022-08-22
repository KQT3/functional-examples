package com.example.portal.master;

import com.example.portal.function.TestClass;
import lombok.Setter;

public class Run implements Runnable{
    @Setter
    Person person;

    @Override
    public void run() {
        TestClass testClass = new TestClass();
        testClass.studentConsumer(Person::create, this::setPerson);
        System.out.println(person);
        System.out.println(Thread.currentThread().getName());
    }
}
