package ru.kugurakova;

public class ParkingPlace {
    private Transport transport;
    private String number;

    public String getNumber() {
        return this.number;
    }
    public void setTransport(Transport transport) {

        this.transport = transport;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Transport getTransport(){
        return this.transport;
    }
}
