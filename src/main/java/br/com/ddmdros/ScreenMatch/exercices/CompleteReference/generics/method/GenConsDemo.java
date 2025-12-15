package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.method;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.showVal();
        test2.showVal();
    }
}
