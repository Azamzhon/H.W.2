package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        createObject("First").print();
        createObject("Second").print();
        createObject("Third").print();

    }

    public static Printable createObject(String className){
        Printable print= null;
        switch(className){
            case "First" :
                print = new Aguero("Sergio", 30, "Forward", 10, "Goal-machine");
                break;
            case "Second" :
                print = new DeBruyne("Kevin", 27, "Midfielder", 17, "Having joy with friends");
                break;
            case "Third" :
                print = new Ederson("Moraes", 25, "Goalkeeper", 31);
                break;
        }
        return print;
    }
}
