package com.example.myapplication;
import java.util.Date;

public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name,birthDate);
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public void pet() {
    }
}
