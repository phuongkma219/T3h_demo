package javaEx2;

public class Video extends Audio{
    String product;

    @Override
    void play() {
        System.out.println("play video");
    }
}
