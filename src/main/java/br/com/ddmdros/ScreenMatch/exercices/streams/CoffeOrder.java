package br.com.ddmdros.ScreenMatch.exercices.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeOrder {

    public static void main(String[] args) {

        List<String> coffees = List.of("Cappuccino",
                "Americano", "Expresso", "Cortado", "Mocha", "Cappuccino", "Flat Whit", "Latte");

        List<String> coffeesEndingInO = coffees.stream()
                .sorted()
                .distinct() // avoid duplicates
                .filter(s -> s.endsWith("o"))
                .collect(Collectors.toUnmodifiableList());

        System.out.println(coffeesEndingInO);

    }
}
