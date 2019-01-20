package ru.kugurakova;

public class MatrixWorker {

    public static void print(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }
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
//                c[i][j]=v;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int N=3;
        int mat1[][] = new int[N][N];
        int mat2[][] = new int[N][N];
//        MatrixWorker mat2 = new MatrixWorker();
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                mat1[j][i]=1+j+i;
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                mat2[j][i]=2+j+i;
            }
        }
        System.out.println(" mat1 ");
        print(mat1);
        System.out.println(" mat2 ");
        print(mat2);

        int mat3[][] =  new int[N][N];
        mat3=sum(mat1,mat2);
        System.out.println(" mat3 ");
        print(mat3);
        int mat4[][] = new int[N][N];
        mat4 = MatrixWorker.mult(mat1,mat2);
        System.out.println(" mat4 ");
        print(mat4);

    }

}
