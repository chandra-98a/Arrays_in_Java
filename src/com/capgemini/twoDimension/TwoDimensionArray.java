package com.capgemini.twoDimension;

import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args){
        int i,j;
        int[][] a =new int[3][4];
        Scanner scan=new Scanner(System.in);
        //To obtain the values for 2D array
        for (i=0;i<=a.length-1;i++){
            for (j=0;j<=a.length-1;j++){
                System.out.println("Enter the elements for a[i][j]");
                a[i][j]=scan.nextInt();
            }
        }
        //for printing 2 D array
        for (i=0;i<= a.length-1;i++){
            for (j=0;j<=a.length-1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
