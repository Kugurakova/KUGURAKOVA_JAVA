package ru.kugurakova;

public class Main {
    public static void print(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N=4;
        int n=N;
        int o=0;
        int mat[][] = new int[N][N];
        int value=1;
        print(mat);
        int i = 0;
        int j = 0;
        while (value<(N*N+1)){
            if (value<(N*N+1)) {
                for (int k = o; k < n; k++) {
                    mat[i][k] = value;
                    value++;
                    j = k;
                }
            }
            if (value<(N*N+1)) {
                for (int k = o + 1; k < n; k++) {
                    mat[k][j] = value;
                    value++;
                    i = k;
                }
            }
            if (value<(N*N+1)) {
                for (int k = n - 2; k != o - 1; k = k - 1) {
                    mat[i][k] = value;
                    value++;
                    j = k;
                }
            }
            if (value<(N*N+1)) {
                for (int k = n - 2; k != o; k = k - 1) {
                    mat[k][j] = value;
                    value++;
                    i = k;
                }
            }
            n = n-1;
            o = o+1;
        }
        print(mat);
    }
}
