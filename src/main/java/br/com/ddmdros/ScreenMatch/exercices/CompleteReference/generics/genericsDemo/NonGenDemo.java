package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.genericsDemo;

public class NonGenDemo {
    public static void main(String[] args) {
        //NonGen iOb;
        //iOb = new NonGen(88);
        NonGen iOb = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("value: " + v + "\n");

        NonGen strOb = new NonGen("Non-Generics Test");
        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("value: " + str);

        iOb = strOb;
        v = (Integer) iOb.getOb();

    }

}
