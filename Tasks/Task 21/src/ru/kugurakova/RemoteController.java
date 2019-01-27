package ru.kugurakova;

public class RemoteController {
    private TV tv;

    public RemoteController (TV tv) {
        this.tv = tv;
    }

    public void pressButton(int buttonNumber) {
        System.out.println(" Show Channal "+buttonNumber);
        tv.showChannel(buttonNumber);
    }
}
