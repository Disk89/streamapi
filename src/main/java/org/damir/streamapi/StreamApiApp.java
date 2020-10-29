package org.damir.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StreamApiApp {
    public static void main(String[] args) {
        String str = "Чтобы начать изучение Java Stream API, разберём основные определения. В языке Java есть понятие\n" +
                "потоков, но ни классы InputStream (поток ввода) и OutputStream (поток вывода), ни Thread (поток\n" +
                "исполнения) не имеют ничего общего с новшеством Java 8 — Stream API. Stream API работает не с\n" +
                "потоком в прямом смысле слова, а с цепочкой функций, вызываемых из самих себя. Он обеспечивает\n" +
                "функциональное программирование в Java 8. Поток — это последовательность элементов и функций,\n" +
                "которые поддерживают различные виды операций. Чтобы не путаться в понятиях, обозначим Stream\n" +
                "API как стрим.";
        str = str.replaceAll("\\p{Punct}","");
        String[] strings = str.toLowerCase().split(" ");

        HashMap<String, Integer> findMacCount = new HashMap<>();
        for (int i = 0; i< strings.length; i++){
            findMacCount.put(strings[i], findMacCount.getOrDefault(strings[i], 0) + 1);
        }
        System.out.println(findMacCount);

    }
}
