package ru.kugurakova;

public class MatrixWorker {

    public static int[][] sum(int a[][], int b[][]) {
        int c[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static int[][] mult(int a[][], int b[][]) {
        int c[][] = new int[a.length][a.length];
        int v = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                v=0;
                for (int k = 0; k < a[i].length; k++) {
                    v = v + a[i][k] * b[k][j];
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    public static void print(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }
}


