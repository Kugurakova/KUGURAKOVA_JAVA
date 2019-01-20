package ru.kugurakova;

import java.util.Random;

    public class MainArrayRandom {
            public static void print(int m[][]) {
                for (int i = 0; i < m.length; i++) {
                    for (int j = 0; j < m[i].length; j++) {
                        System.out.print(m[i][j]+ " ");
                    }
                    System.out.println();
                }
            }

            public static void FillRandom(int m[][]) {
                Random rndm = new Random();
                for (int i = 0; i < m.length; i++) {
                    for (int j = 0; j < m[i].length; j++) {
                        m[i][j] = rndm.nextInt(10);
                    }
                }
            }
            public static void main(String[] args) {
                int array[][] = new int[4][];
                Random random = new Random();
                for (int i = 0; i < array.length; i++) {
                    array[i] = new int[random.nextInt(10) + 1];
                }
                FillRandom(array);
                print(array);
            }
    }
