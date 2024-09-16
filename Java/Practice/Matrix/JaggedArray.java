package Practice.Matrix;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int a [][] = new int [2][];
        a[0] = new int [2];
        a[1] = new int [3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("Enter Element for position "+i+" "+"and"+" "+j+" ");
                a[i][j] = sc.nextInt();
            }
        } 

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        

    }
}
