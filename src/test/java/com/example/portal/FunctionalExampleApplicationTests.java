package com.example.portal;

import com.example.portal.core.Identifier;
import com.example.portal.core.Version;
import com.example.portal.master.Person;
import com.example.portal.master.Student;
import com.example.portal.master.TestClass;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class FunctionalExampleApplicationTests {
    @Setter
    Student student;

    @Test
    void create_student_success() {
        var student = Student.builder()
                .id(Identifier.create())
                .version(Version.create())
                .name("student-name")
                .build();

        Assertions.assertNotNull(student.id());
        Assertions.assertNotNull(student.version());
        Assertions.assertEquals("student-name", student.name());
        Assertions.assertEquals("STUDENT", student.getDomainObjectType().name());
    }

    @Test
    void name() {

    }

}
