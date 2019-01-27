package ru.kugurakova;

public class Main {

    public static void main(String[] args) {
//        MatrixWorker matrixWorker = new MatrixWorker();
        int n=4;
        int mat1[][] = new int[n][n];
        int mat2[][] = new int[n][n];
        int mat3[][] = new int[n][n];
        int mat4[][] = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat1[j][i]=1+j+i;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat2[j][i]=2*j+i;
            }
        }
        System.out.println("mat1");
        MatrixWorker.print(mat1);
        System.out.println("mat2");
        MatrixWorker.print(mat2);
        mat3 = MatrixWorker.sum(mat1,mat2);
        System.out.println("mat3");
        MatrixWorker.print(mat3);
        mat4 = MatrixWorker.mult(mat1,mat2);
        System.out.println("mat4");
        MatrixWorker.print(mat4);
    }
}
