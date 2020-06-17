package com.dawidciesielski;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N21",
                "B24", "B34",
                "J65", "J65", "J54", "J36",
                "I68", "I17", "I29", "I71", "i23",
                "O71");

//        List<String> iNumbers = new ArrayList<>();
//
//        someBingoNumbers.forEach(number -> {
//            if (number.startsWith("I")) {
//                iNumbers.add(number);
//            }
//        });
//
//        iNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        iNumbers.forEach((String s) -> System.out.println(s));

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("I"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I68", "I17", "I29", "W71");
        Stream<String> inNumberStream = Stream.of("N40", "M23", "R26", "K82");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());
    }
}
