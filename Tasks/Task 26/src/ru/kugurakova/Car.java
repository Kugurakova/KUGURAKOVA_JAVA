package ru.kugurakova;

public class Car {
    private String name;
    private int age;
    private int run;


    public Car(String name, int age, int run) {
        this.name = name;
        this.age = age;
        this.run = run;
    }

    public int getAge() {
        return age;
    }

    public int getRun() {
        return run;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return this.name + " " + this.age + "(" + this.run + ");";
    }
}
