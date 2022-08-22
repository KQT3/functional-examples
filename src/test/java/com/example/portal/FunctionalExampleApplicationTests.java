package com.example.portal;

import com.example.portal.core.Identifier;
import com.example.portal.core.Version;
import com.example.portal.master.Student;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
