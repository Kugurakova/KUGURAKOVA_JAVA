package ru.kugurakova;

public class Car  implements Comparable <Car> {
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

    @Override
    public int compareTo(Car o) {
        if (this.age == o.age){
            return o.run - this.run;
        }
        else {
            return this.age - o.age;
        }
    }
}
