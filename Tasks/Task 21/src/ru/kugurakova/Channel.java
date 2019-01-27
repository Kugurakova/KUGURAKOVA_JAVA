package ru.kugurakova;

public class Channel {
    private String channelname;
    private int nomer;
    private Program prgrms[];
    private int countPrograms;

    public Channel(int nomer, String channelname) {
        this.nomer = nomer;
        this.channelname = channelname;
        this.prgrms = new Program[100];
        this.countPrograms=0;
    }

    public String getChannelName() {
        return this.channelname;
    }

    public int getNomer() {
        return this.nomer;
    }

    public int getcountPrograms (){
        return countPrograms;
    }

    void addProgram(Program program) {
        this.prgrms[countPrograms] = program;
        this.countPrograms++;
    }
    void show(int numpr) {
//        programs[random.nextInt()].printName();
        prgrms[numpr].showProgram();
    }
}




