package br.com.ddmdros.ScreenMatch.exercices.headfirst.generics;

import java.util.Collections;
import java.util.List;

public class Jukebox3 {
    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go(){
        List<SongV3> songV3List = MockSongs.getSongsV3();
        System.out.println(songV3List);

        Collections.sort(songV3List);
        System.out.println(songV3List);
    }
}
