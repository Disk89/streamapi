package org.damir.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        List<Integer> out = integers.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }).collect(Collectors.toList());
//        List<Integer> out2 = integers.stream().filter((n)-> n % 2 == 0).collect(Collectors.toList());
//
//        integers.stream().filter((n)-> n % 2 == 1).forEach((n)-> System.out.println(n));
//        System.out.println(out);
//        System.out.println(out2);

//        Stream.of("AA", "BBB", "C", "DDDD").map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        }).forEach(System.out::println);
//        System.out.println();
//
//        Stream.of("AA", "BBB", "C", "DDDD").map(s -> s.length()).forEach(System.out::println);
//        System.out.println();
//
//
//        Stream.of("AA", "BBB", "C", "DDDD").map(String::length).map(n -> n * 10).forEach(System.out::println);
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        integers.stream().sorted((o1, o2)-> o2 - o1).limit(5).forEach(n -> System.out.print(n));
    }
}
