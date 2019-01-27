package ru.kugurakova;

public class Program {
    private String name;
    private double len;

    Program(String name, double len) {
        setName(name);
        setLen(len);
    }
    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return  this.name = name;
    }
    public double getLen() {
        return this.len;
    }

    public double setLen(double len) {
      return  this.len = len;
    }

    public void showProgram (){
        System.out.println(" Show Program - " + this.name);
    }
}
