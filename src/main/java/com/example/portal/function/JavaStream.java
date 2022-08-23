package com.example.portal.function;

import com.example.portal.core.Identifier;
import com.example.portal.core.Version;
import com.example.portal.master.Student;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) throws URISyntaxException, IOException {
        var url = MainFunction.class.getClassLoader().getResource("names.txt").toURI();
        Path path = Paths.get(url);
        List<String> nameList = Files.readAllLines(path);

        var parallel = nameList.parallelStream()
                .filter(s -> s.length() > 5);
        System.out.println(parallel);

        var newPersonList = nameList.stream()
                .map(name -> Student.create(name, new Random().nextInt(50)))
                .toList();

        Function<Student, String> getName = Student::name;
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
        Function<String, String> uppercase = String::toUpperCase;

        Function<Student, String> getReverseUppercaseName = getName.andThen(reverse).andThen(uppercase);

        var stringStream = newPersonList.stream().map(getReverseUppercaseName)
                .collect(Collectors.toList());
        Collections.reverse(stringStream);
        System.out.println(stringStream);

        Function<Integer, Integer> timeTwo = x -> x * 2;
        Function<Integer, Integer> minusOne = x -> x - 1;
        Function<Integer, Integer> timesTwoMinusOne = timeTwo.andThen(minusOne);
        System.out.println(timesTwoMinusOne.apply(10));
    }


}
