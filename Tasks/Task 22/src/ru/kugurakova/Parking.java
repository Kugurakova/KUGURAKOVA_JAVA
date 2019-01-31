package ru.kugurakova;

public class Parking {
    private final int MAX_Space_COUNT = 5;
    private ParkingPlace places[];
    private int countSpace;

    public Parking() {
        this.places = new ParkingPlace[MAX_Space_COUNT];
        for (int i = 0; i < places.length; i++) {
            this.places[i] = new ParkingPlace();
        }
        countSpace = MAX_Space_COUNT;
    }

    public int getCountSpace(){
        return this.countSpace;
    }

    public void park(Transport transport) {
        if (transport.getParked() == false){
            for (int i = 0; i < this.places.length; i++) {
                if (this.places[i].getNumber() == null) {
                    this.places[i].setTransport(transport);
                    transport.setParked(true);
                    this.places[i].setNumber(transport.getNumber());
                    countSpace = countSpace - 1;
                    return;
                }
            }
            System.out.println("Нет мест");
        }
        else {
            System.out.println("Уже запаркован");
        }

    }

    public void unpark(String number) {
        for (int i = 0; i < MAX_Space_COUNT; i++) {
            if (places[i].getNumber().equals(number)) {
                places[i].getTransport().setParked(false);
                places[i].setNumber(null);
                places[i].setTransport(null);
                countSpace++;
                return;
            }
        }
        System.out.println("Такой машины нет");
   }
}
