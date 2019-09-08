package javaEx2;

import javax.sound.midi.Soundbank;

public abstract class Audio {
    String name;
    String type;
    int duration;
    String quality;

    abstract void play();
    void showInfo(){
        System.out.println(" Name : "+ name );
        System.out.println(" Type : " + type);
        System.out.println(" Duration : "+ duration );
        System.out.println(" Quality : "+ quality);
    }
}

