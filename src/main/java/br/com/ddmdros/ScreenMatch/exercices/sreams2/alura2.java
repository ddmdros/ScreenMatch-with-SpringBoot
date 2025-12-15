package br.com.ddmdros.ScreenMatch.exercices.sreams2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class alura2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> ordenado = palavras.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(ordenado);


    }
}
