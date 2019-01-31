package ru.kugurakova;

public abstract class Transport {
    private String number;
    private boolean parked = false ;

    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public boolean getParked () {
        return this.parked;
    }
    public void setParked(boolean parked){
        this.parked = parked;
    }
}
