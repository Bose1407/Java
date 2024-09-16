package Practice.Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows for Matrix 1 : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no of columms for Matrix 2 : ");
        int columms = sc.nextInt();

        int a[][] = new int[rows][columms];

        for(int i=0 ; i<rows ;i++){
            for(int j=0;j<columms;j++){
                System.out.println("Enter Element for position "+i+" "+"and"+" "+j+" "+"For Matrix 1");
                a[i][j] =sc.nextInt();
            }
        }

        System.out.println("Matrix 1 :- ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Enter the no of rows for Matrix 2: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the no of columms for Matrix 2 : ");
        int columms1 = sc.nextInt();


        
        int b[][] = new int[rows1][columms1];

        for(int i=0 ; i<rows1 ;i++){
            for(int j=0;j<columms1;j++){
                System.out.println("Enter Element for position "+i+" "+"bnd"+" "+j+" "+"For Matrix 2");
                b[i][j] =sc.nextInt();
            }
        }


        System.out.println("Matrix 2 :- ");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int c[][] = new int[a.length][b[0].length];

        for(int i = 0 ; i<a.length;i++){
            for(int j = 0;j<b[0].length;j++){
                for(int k = 0;k<a[0].length;k++){
                    c[i][j] = c[i][j] + ((a[i][k]*b[k][j]));
                }
            }
        }

        System.out.println("*****************Matrix Multiplication************");

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


        sc.close();

        //2,3 X 3,2


    }
}
