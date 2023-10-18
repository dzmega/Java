package com.example.demo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Person {
    private String name;
    private IntegerProperty alter = new SimpleIntegerProperty(this,"Alter",0);

    public Person(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter.get();
    }

    public IntegerProperty alterProperty() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter.set(alter);
    }
}
