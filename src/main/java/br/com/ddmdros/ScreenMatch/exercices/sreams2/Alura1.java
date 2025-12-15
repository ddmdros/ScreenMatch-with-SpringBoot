package br.com.ddmdros.ScreenMatch.exercices.sreams2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class Alura1 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        //meu codigo
        IntSummaryStatistics stats = numeros.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println(stats.getMax());

        //codigo da aula
        Optional<Integer> max = numeros.stream().max(Integer::compare);
        max.ifPresent(System.out::println);
    }
}
