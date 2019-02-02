package ru.kugurakova;

import java.io.FileInputStream;
import java.io.InputStream;

public class MyScanner {
    private InputStream inputstream;

    public MyScanner(String fileName) throws Exception {
        this.inputstream = new FileInputStream(fileName);
    }

    public int nextInt() throws Exception  {
        int i = 0;
        int result = 0;
        while (i != -1) {
            if ((i != -1)&&('0' <= i)&&(i <= '9')){
                result = result*10 + i - '0';
            }
            i = this.inputstream.read();
        }
     return result;
    }
}
