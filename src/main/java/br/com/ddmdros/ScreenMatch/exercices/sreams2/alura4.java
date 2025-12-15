package br.com.ddmdros.ScreenMatch.exercices.sreams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// 4 - Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.

public class alura4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        int somaQuadradosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .reduce(0, Integer::sum);
        System.out.println(somaQuadradosPares);

    }
}
