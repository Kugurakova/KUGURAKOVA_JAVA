package ru.kugurakova.models;

import ru.kugurakova.repositories.List;

public class Car {
    private int id;
    private String name;
    private int owner;

    public Car(String name,int owner) {
        this.name = name;
        this.owner = owner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

}
