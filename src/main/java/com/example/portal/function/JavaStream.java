package com.example.portal.function;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaStream {
    public static void main(String[] args) throws URISyntaxException, IOException {
        var url = MainFunction.class.getClassLoader().getResource("names.txt").toURI();
        Path path = Paths.get(url);
        List<String> nameList = Files.readAllLines(path);

        var parallel = nameList.parallelStream()
                .filter(s -> s.length() > 5);
        System.out.println(parallel);

    }

}
