package ru.kugurakova;

public class Main {

    public static void main(String[] args) {
        Parking parkMega  = new Parking();
        //самолеты, машины, танки, вертолеты, космические корабли, велосипеды
        Samolet tu54 = new Samolet();
        tu54.setNumber("tu54-789");
        Car lada = new Car();
        lada.setNumber("116 x789xx");
        Tank t26 = new Tank();
        t26.setNumber("t789");
        Vertolet mi8  = new Vertolet();
        mi8.setNumber("v545");
        Raketa souz = new Raketa();
        souz.setNumber("r333");
        Bicycle kama = new Bicycle();
        kama.setNumber("velik");
        System.out.println(tu54.getNumber());
        System.out.println(parkMega.cntFreePlaces());

//        parkMega.Par
//        parkMega.park(tu54);

    }
}
