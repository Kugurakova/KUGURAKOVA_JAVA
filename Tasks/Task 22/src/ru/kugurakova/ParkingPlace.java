package ru.kugurakova;

public class ParkingPlace {
    private Transport transport;

    public String getNumber() {
        return this.transport.getNumber();
    }
    public void setTransport(Transport transport) {
        this.transport = transport;
    }
    public void setNumber(String number) {
        this.transport.setNumber(number);
    }

}
