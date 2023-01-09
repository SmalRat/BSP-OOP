package ua.edu.ucu.task3;

import java.lang.instrument.Instrumentation;

public class Main {
    public static void main(String[] args){
        MyImage image = new ProxyImage("photo.png"); // Image by Michi S from Pixabay
        System.out.println("initialized");
        image.display();
        System.out.println("displayed");

    }
}
