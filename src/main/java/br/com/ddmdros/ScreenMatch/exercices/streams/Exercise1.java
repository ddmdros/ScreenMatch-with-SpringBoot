package br.com.ddmdros.ScreenMatch.exercices.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,85, 86);

        List<Integer> streamNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n *2)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(streamNumbers);

        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        List<String> exercicio4 = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        exercicio4.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
