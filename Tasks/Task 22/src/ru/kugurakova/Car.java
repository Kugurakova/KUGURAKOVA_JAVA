package ru.kugurakova;

public class Car extends Transport implements Move{
    private int speed = 0;
    public int getSpeed(){return speed;}
    public void setSpeed (int speed){
        this.speed = speed;
    }
    public void go (int speed) {
        setSpeed(speed);
    }

}
