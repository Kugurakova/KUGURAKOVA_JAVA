package ru.kugurakova;

public class Raketa extends Transport  implements Flying  {
    private double height = 0 ;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height = height*3;
    }

    @Override
    public void fly(double value) {
        setHeight(value);
    }

}
