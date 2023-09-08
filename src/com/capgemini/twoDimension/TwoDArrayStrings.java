package com.capgemini.twoDimension;

import java.util.Scanner;

public class TwoDArrayStrings {
    public static void main(String[] args){
        int x=0,y=0;
        String [][] s=new String[4][5];

        Scanner scan=new Scanner(System.in);
        for (x=0;x<=s.length-1;x++){
            for (y=0;y<=s.length-1;y++){
                System.out.println("Enter the name of the Fruits");
                s[x][y]=scan.next();
            }
        }
        for (x=0;x<=s.length-1;x++){
            for (y=0;y<=s.length-1;y++) {
                System.out.print(s[x][y]+" ");
            }
            System.out.println();
            }

    }
}
