package javaEx2;

public class Song extends Audio {
    String artis;
    String album;

    @Override
    void play() {
        System.out.println("play song");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Artis : "+ artis);
        System.out.println("Album : "+ album);
    }
}
