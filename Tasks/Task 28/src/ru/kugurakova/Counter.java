package ru.kugurakova;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter extends Thread {
    private int from;
    private int to;
    private static final Lock lock = new ReentrantLock();
    private int array[];

    private int sumResult;

    public Counter(int from, int to, int array[]) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    public int getSumResult() {
        return sumResult;
    }

    @Override
    public void run() {
        // TODO: считаете числа от from до to и кладете результат в sumResult.

        for (int i = from; i <= to; i++) {
            sumResult += array[i];
            lock.lock();
            Main.Summa += array[i];
            lock.unlock();
        }

    }
}
