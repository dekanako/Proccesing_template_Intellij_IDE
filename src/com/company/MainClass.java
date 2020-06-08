package com.company;
import processing.core.PApplet;

public class MainClass extends PApplet {
    public static void main(String[] args) {
        PApplet.main(MainClass.class, args);
    }

    @Override
    public void settings() {
        size(1000, 800);
    }


    @Override
    public void setup() {
        background(0);

    }

    @Override
    public void draw() {
        background(0);
    }
}
