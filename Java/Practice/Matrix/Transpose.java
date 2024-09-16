package Practice.Matrix;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows for Matrix 1 : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no of columms for Matrix 2 : ");
        int columms = sc.nextInt();

        int a[][] = new int[rows][columms];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columms; j++) {
                System.out.println("Enter Element for position " + i + " " + "and" + " " + j + " " + "For Matrix 1");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 :- ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int b[][] = new int[a[0].length][a.length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                b[j][i]=a[i][j];
            }
        }
        System.out.println("******Transpose Matrix*************");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
