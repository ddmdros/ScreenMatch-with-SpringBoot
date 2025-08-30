package br.com.ddmdros.ScreenMatch.exercices.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExercisesAlura {


    // <editor-fold desc="Main">
    public static void main(String[] args) {


        //exercicio1();
        //exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        //exercicio6();
        //exercicio7();
    }

    // </editor-fold>

    // <editor-fold desc="Exercícios">

    public static void exercicio1(){
        IExercicio1 mult = (a, b) -> a * b;
        System.out.println(mult.parDeInteiros(5,3));

        IExercicio1 div = (a, b) -> a/b;
        System.out.println(div.parDeInteiros(10,2));

    }

    public static void exercicio2(){

        IExercicio2 isPrimo = (a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a);i++){
                if (a % i == 0) return false;
            }
            return true;
        };

        System.out.println(11);
        System.out.println(isPrimo.verificaPrimo(12));
    }

    public static void exercicio3(){

        IExercicio3 allCaps = string -> string.toUpperCase();
        System.out.println(allCaps.string("bom dia"));
        System.out.println(allCaps.string("ibge, ufsc"));

    }

    public static void exercicio4(){
        IExercicio4 palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificaPalindromo("radar"));
        System.out.println(palindromo.verificaPalindromo("java"));

    }

    public static void exercicio5(){

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        System.out.println(numeros);
        numeros.replaceAll(n -> n*3);
        System.out.println(numeros);

        List<Integer> triplo = new ArrayList<>();
        IExercicio5.listaInteiros.add(4);
        IExercicio5.listaInteiros.add(3);
        IExercicio5.listaInteiros.add(4);
        IExercicio5.listaInteiros.add(5);
        IExercicio5.listaInteiros.add(6);

        IExercicio5.listaInteiros.forEach (v ->{
            triplo.add(v*3);
        });

        System.out.println(IExercicio5.listaInteiros);
        System.out.println(triplo);

    }

    public static void exercicio6(){
        List<String> listaStrings = Arrays.asList("Maria", "José", "Pedro");

        listaStrings.sort((a,b) -> a.compareTo(b));
        System.out.println(listaStrings);
    }

    public static void exercicio7(){

        IDivisor divisor = (a, b) ->
        {
         if (b == 0) throw new ArithmeticException("Divisão por zero");
         return a/b;
        };

        try {
            System.out.println(divisor.dividir(10,2));
            System.out.println(divisor.dividir(10,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
// </editor-fold>

}
