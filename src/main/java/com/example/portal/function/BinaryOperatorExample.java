package com.example.portal.function;

import com.example.portal.master.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        Student student = Student.create("Jordan", 10);
        Student student1 = Student.create("Jaden", 100);
        Student student2 = Student.create("Jack", 50);
        Student student3 = Student.create("Alex", 30);
        Student student4 = Student.create("Myong", 20);
        Student student5 = Student.create("Lex", 10);
        List<Student> list = Arrays.asList(student, student1, student2, student3, student4, student5);

        Student studentWithHighestAge = find(list, BinaryOperator.maxBy(Comparator.comparing(Student::age)));
        System.out.println(studentWithHighestAge);

        Student studentWithLowestAge = find(list, BinaryOperator.minBy(Comparator.comparing(Student::age)));
        System.out.println(studentWithLowestAge);
    }

    public static Student find(List<Student> list, BinaryOperator<Student> accumulator) {
        return list.stream().reduce(accumulator).orElseThrow();
    }
}
