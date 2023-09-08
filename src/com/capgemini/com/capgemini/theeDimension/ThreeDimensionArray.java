package com.capgemini.com.capgemini.theeDimension;

import java.util.Scanner;

public class ThreeDimensionArray {
    public static void main(String[] args) {
        int a[][][] = new int[2][3][4];
        int i, j, k;
        Scanner scan = new Scanner(System.in);
        for (i = 0; i <= a.length - 1; i++) {
            for (j = 0; j <= a[i].length - 1; j++) {
                for (k = 0; k <= a[i][j].length - 1; k++) {
                    System.out.println("Enter value for 3D array");
                    a[i][j][k] = scan.nextInt();
                }
            }
        }
        for (i = 0; i <= a.length - 1; i++) {
            for (j = 0; j <= a[i].length - 1; j++) {
                for (k = 0; k <= a[i][j].length - 1; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
