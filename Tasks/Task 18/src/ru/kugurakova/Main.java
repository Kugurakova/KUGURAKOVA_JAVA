package ru.kugurakova;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Main {

    public static void main(String[] args) {
        int N=3;
        int mat1[][] = new int[N][N];
        int mat2[][] = new int[N][N];
        int mat3[][] = new int[N][N];
        int mat4[][] = new int[N][N];

//        MatrixWorker mat2 = new MatrixWorker();
        for (int i = 0; i < N-1; i++){
            for (int j = 0; j < N-1; j++){
                mat1[j][i]=j+i;
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                mat1[j][i]=1+j+i;
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                mat2[j][i]=2*j+i;
            }
        }
        MatrixWorker.print(mat1);
        System.out.println();
        MatrixWorker.print(mat2);
        mat3=MatrixWorker.sum(mat1,mat2);
        mat4=MatrixWorker.mult(mat1,mat2);
        System.out.println();
        MatrixWorker.print(mat3);
        System.out.println();
        MatrixWorker.print(mat4);
    }
}
