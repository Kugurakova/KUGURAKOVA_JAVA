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
        System.out.println("Свобоных месть:" + parkMega.getCountSpace());
        System.out.println("Припаркован:"+tu54.getNumber() + " " + tu54.getParked());
        parkMega.park(tu54);
        System.out.println("Припаркована:"+tu54.getNumber() + " " + tu54.getParked());
        parkMega.park(tu54);
        parkMega.park(lada);
        parkMega.park(t26);
        parkMega.park(mi8);
        parkMega.park(souz);
        System.out.println("Свобоных месть:" + parkMega.getCountSpace());
        parkMega.unpark(kama.getNumber());
        parkMega.park(kama);
        parkMega.unpark(mi8.getNumber());
        System.out.println("Свобоных месть:" + parkMega.getCountSpace());
        parkMega.park(kama);
        System.out.println("Свобоных месть:" + parkMega.getCountSpace());
        System.out.println("Свобоных месть:" + parkMega.getCountSpace());



    }
}
