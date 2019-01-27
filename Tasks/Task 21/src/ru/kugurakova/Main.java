package ru.kugurakova;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV();
        RemoteController control = new RemoteController(tv);
        Channel channel1 = new Channel(1, "1 First");
        Channel channel2 = new Channel(2, "Rossia 1");
        Channel channel3 = new Channel(3, "Match");
        tv.addChannal(channel1);
        tv.addChannal(channel2);
        tv.addChannal(channel3);
        Program pr11 = new Program("Dobroe ytro",3);
        Program pr12 = new Program("Novosti",0.25);
        Program pr13 = new Program("Modnii prigovor",1.5);
        Program pr21 = new Program("Ytro Rossii", 3);
        channel1.addProgram(pr11);
        channel1.addProgram(pr12);
        channel1.addProgram(pr13);
        channel2.addProgram(pr21);
        channel2.addProgram(new Program("Vesti", 0.15));
        channel2.addProgram(new Program("60 minute", 1));
        channel3.addProgram(new Program("Biatlon",2 ));
        channel3.addProgram(new Program("Box",1));
        channel3.addProgram(new Program("Futbal",2));
        control.pressButton(0);
        control.pressButton(1);
        control.pressButton(2);

    }
}
