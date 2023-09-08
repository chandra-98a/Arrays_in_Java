package com.capgemini.oneDimension;

import java.util.Scanner;

public class OneDArray2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a[];
        a=new int[10];
        int i;
        for ( i=0;i<10;i++){
            System.out.println("Enter the value of a");
            a[i]=scan.nextInt();
        }
        for ( i=0;i<10;i++) {
            System.out.println(a[i]);
        }

    }
}
