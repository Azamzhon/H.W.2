package com.company;

public class Ederson extends ManCityPlayers {
    private int kitNumber;

    public Ederson(String name, int age, String position, int kitNumber) {
        super(name, age, position);
        this.kitNumber = kitNumber;
    }

    public int getKitNumber() {
        return kitNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getKitNumber());
    }
}
