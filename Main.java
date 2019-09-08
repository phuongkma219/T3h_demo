package javaEx2;

public class Main {
    public static void main(String[] args) {
        Song song = new Song();
        song.name = "abc";
//       Song song1 = song;
//       song1.name = "Hello";
//       song =new Song();
//       song.name = "ahihi";
//        System.out.printf(song.name);
//        song.name = "Nv SOng";
//        video.name = "Nv VIdeo";
//        song.showInfo();
//        video.showInfo();
        updateName(song);
        System.out.printf(song.name);
    }
    public static void updateName(Song song){
        song.name = "test";
    }

}
