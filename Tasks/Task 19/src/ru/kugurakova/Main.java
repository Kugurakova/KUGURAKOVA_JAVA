package ru.kugurakova;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        int N=4;
        int mat[][] = new int[N][N];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("do");
        print(mat);
        System.out.println("posle");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i < j){
                    mat[i][j] = mat[i][j]*2;
                }
                if (i > j) {
                    mat[i][j] = mat[i][j]/2;
                }
            }
        }
        print(mat);
    }

}
