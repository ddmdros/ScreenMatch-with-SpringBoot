package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.method;

public class GenCons {
    private double val;


    // GenCons não é uma classe genérica,
    // mas seu construtor é
    // Com isso, podemos criar instancias
    // de qualquer tipo aceito pelo generics
    // Nesse caso, a classe Number
    // (Integer, Float e Double)

    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    void showVal(){
        System.out.println("val: " + val);
    }
}
