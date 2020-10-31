package org.damir.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiApp {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. A diam sollicitudin tempor id eu nisl nunc mi ipsum. Consequat " +
                "interdum varius sit amet mattis. Diam vel quam elementum pulvinar. Urna cursus eget " +
                "nunc scelerisque. Diam maecenas ultricies mi eget mauris pharetra et ultrices." +
                "Convallis convallis tellus id interdum velit laoreet id donec. Est placerat" +
                "in egestas erat. Tempus iaculis urna id volutpat lacus laoreet non." +
                "Morbi tempus iaculis urna id. Libero id faucibus nisl tincidunt eget nullam non nisi." +
                "Pulvinar proin gravida hendrerit lectus. Vitae et leo duis ut diam quam.";

        str = str.replaceAll("\\p{Punct}","");
        String[] strings = str.toLowerCase().split(" ");
        String word = Arrays.stream(strings).filter((n)-> n.length() > 2)
                      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                      .entrySet().stream()
                      .max(Comparator.comparingLong(e -> e.getValue()))
                      .get().getKey();

        System.out.println(word);
    }
}
