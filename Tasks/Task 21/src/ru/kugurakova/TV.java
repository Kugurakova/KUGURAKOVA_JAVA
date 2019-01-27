package ru.kugurakova;

import java.util.Random;
import java.nio.channels.Channels;

public class TV {
    private final int MAX_Channel_COUNT = 100;
    private Channel channels[];
    private int countChannels;

    public TV() {
        this.channels = new Channel[MAX_Channel_COUNT];
        this.countChannels = 0;
    }
    void addChannal(Channel channel) {
        this.channels[countChannels] = channel;
        this.countChannels++;
    }
    public void showChannel(int channelnomer) {
        Random random  = new Random();
//        channels[channelnomer].show(channelnomer);
        channels[channelnomer].show(random.nextInt(3));
    }

}
