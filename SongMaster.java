package javaEx2;

import java.util.ArrayList;
import java.util.List;

public class SongMaster {
    List<Song> songs = new ArrayList<>();
    void addSong(Song song){
        System.out.println("add song....");
    }
    void searchSong(Song song){
        System.out.println("search loading.....");
    }
}
