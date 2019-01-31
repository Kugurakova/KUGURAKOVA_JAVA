package ru.kugurakova;

public class Samolet extends Transport implements Flying {
    private double height = 0 ;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height = height*2;
    }

    @Override
    public void fly(double value) {
        setHeight(value);
    }
}
