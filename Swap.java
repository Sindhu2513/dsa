package com.sindhu;

import java.util.Scanner;


public class Swap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
       int a = in.nextInt();
       int b = in.nextInt();
//
//        System.out.println("Before Swapping : ");
//        new Swap(a,b);
//    }
//    public Swap() {
//    int temp = a;
//    a = b;
//    b = temp;
//
//    }

  //      int a = 13;
  //      int b = 25;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
    }


        int temp = a;
        a = b;
        b = temp;


        System.out.println("After swapping:a = " + a + ", b = " + b );


    }
