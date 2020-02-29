package com.company;

public class Aguero extends ManCityPlayers {
    private int kitNumber;
    private String playingStyle;

    public Aguero(String name, int age, String position, int kitNumber, String playingStyle) {
        super(name, age, position);
        this.kitNumber = kitNumber;
        this.playingStyle = playingStyle;
    }


    public int getKitNumber() {
        return kitNumber;
    }

    public String getPlayingStyle() {
        return playingStyle;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getKitNumber() + " " + getPlayingStyle());
    }
}
