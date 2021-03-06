package org.damir.streamapi;

import org.damir.streamapi.employee.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        integers.stream().sorted((o1, o2) -> o2 - o1).limit(5).forEach(System.out::print);
        System.out.println();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Iva", 20, 20000));
        employees.add(new Employee("Ira", 30, 30000));
        employees.add(new Employee("Bob", 21, 40000));
        employees.add(new Employee("Ed", 25, 50000));
        employees.add(new Employee("Jhon", 29, 80000));
        employees.add(new Employee("Petra", 50, 200080));
        employees.add(new Employee("Radis", 42, 200980));
        employees.add(new Employee("Mehdi", 45, 100000));

        Double avgSalary = employees.stream().mapToInt(Employee::getSalary).average().getAsDouble();
        System.out.println(avgSalary);
        oldEmployees(employees, 3);




    }
    public static void oldEmployees(List<Employee> employees, int n) {
        System.out.println(employees.stream()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .limit(n)
                .map(Employee::getName)
                .collect(Collectors.joining(", ", n + " самых старших сотрудников зовут: " ,";")));

    }
}
