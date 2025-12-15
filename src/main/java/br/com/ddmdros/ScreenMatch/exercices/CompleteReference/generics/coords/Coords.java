package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.coords;

public class Coords <T extends TwoD>{
    T[] coords;

     Coords(T[] o){
        coords = o;
    }


}
