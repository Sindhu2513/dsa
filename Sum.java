package com.sindhu;

import java.util.Scanner;

import static java.lang.System.in;

public class Sum {
    public static void main(String[] args) {
       int ans = sum();
        System.out.println(ans);
    }
    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: " );
        int num1 = in.nextInt();
        System.out.println("Enter Second number: " );
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is :" + sum);

        return sum;
    }
}
