package ru.kugurakova;

import java.io.FileInputStream;
import java.io.InputStream;

public class MyScanner {
    private InputStream inputstream;

    public MyScanner(String fileName) throws Exception {
        this.inputstream = new FileInputStream(fileName);
    }

    public int nextInt() throws Exception  {
        return inputstream.read();
    }
}
