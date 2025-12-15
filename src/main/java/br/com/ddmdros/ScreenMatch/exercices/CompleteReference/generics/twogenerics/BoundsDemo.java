package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.twogenerics;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};

        Stats<Integer> iob = new Stats<>(inums);
        Stats<Double> dob = new Stats<Double>(dnums);

        double v = iob.average();
        double w = dob.average();

        if (iob.isSameAvg(dob))
            System.out.println("Averages are the same");
        else
            System.out.println("Averages differ");


        System.out.println("iob average is: " + v);
        System.out.println("dob average is " + w);



    }
}
