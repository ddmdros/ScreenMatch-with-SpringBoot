package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.genericsDemo;

public class SimpGen {
    public static void main(String[] args) {
        NonGen.TwoGen<Integer,String> tgObj =
                new NonGen.TwoGen<Integer,String>(88,"Generics");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}
