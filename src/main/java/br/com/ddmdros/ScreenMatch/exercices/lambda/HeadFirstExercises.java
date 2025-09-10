package br.com.ddmdros.ScreenMatch.exercices.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class HeadFirstExercises {
    public static void main(String[] args) {

    Comparator<String> comparator = (s1,s2) -> s1.compareTo(s2);
    Runnable runnable = () -> System.out.println("Hello!");
    Consumer<String> consumer = str -> System.out.println(str);

    }


}
