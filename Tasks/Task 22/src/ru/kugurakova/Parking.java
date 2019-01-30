package ru.kugurakova;

public class Parking {
    private final int MAX_Space_COUNT = 100;
    private ParkingPlace places[];
    private int countSpace;

    public Parking() {
        this.places = new ParkingPlace[MAX_Space_COUNT];
        for (int i = 0; i < places.length; i++) {
            this.places[i] = new ParkingPlace();
        }
//        countSpace++;
    }
    public int cntFreePlaces (){
        int cnt = 0;
//        for (int i = 0; i < this.places.length; i++){
  //          if (this.places[i].getNumber() == null) {
                cnt++;
//            }
  //      }
        cnt = this.places.length;
        return  cnt;
    }

    public void park(Transport transport) {
        for (int i = 0; i < this.places.length; i++) {
            if (this.places[i].getNumber() == null) {
                this.places[i].setTransport(transport);
                this.places[i].setNumber(transport.getNumber());
                return;
            }
        }
        System.err.println("Нет мест");
    }

    public void unpark(String number) {
        for (int i = 0; i < MAX_Space_COUNT; i++) {
            if (places[i].getNumber().equals(number)) {
                places[i].setNumber(null);
                places[i].setTransport(null);
                return;
            }
        }
        System.err.println("Такой машины нет");
   }
}
