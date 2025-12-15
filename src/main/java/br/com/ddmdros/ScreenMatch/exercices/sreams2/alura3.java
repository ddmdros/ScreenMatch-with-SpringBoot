package br.com.ddmdros.ScreenMatch.exercices.sreams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class alura3 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        String resultado = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(resultado);

    }
}
