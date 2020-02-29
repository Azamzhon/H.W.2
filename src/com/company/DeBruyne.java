package com.company;

public class DeBruyne extends ManCityPlayers {
    private int kitNumber;
    private String hobby;

    public DeBruyne(String name, int age, String position, int kitNumber, String hobby) {
        super(name, age, position);
        this.kitNumber = kitNumber;
        this.hobby = hobby;
    }

    public int getKitNumber() {
        return kitNumber;
    }
    public String getHobby(){
        return hobby;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getHobby() + " " + getKitNumber());
    }
}
