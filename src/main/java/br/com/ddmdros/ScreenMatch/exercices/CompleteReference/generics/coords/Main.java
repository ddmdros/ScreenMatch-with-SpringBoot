package br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.coords;

import static br.com.ddmdros.ScreenMatch.exercices.CompleteReference.generics.coords.BoundedWildcard.*;

public class Main {
    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4),
                new TwoD(-1,-23)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);

        System.out.println("Content of tdlocs.");
        showXY(tdlocs);

        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Coords<FourD> fdlocs = new Coords<FourD>(fd);

        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
