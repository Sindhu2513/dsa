package com.sindhu;

import java.util.Arrays;
//import java.util.Scanner;

//import static java.lang.System.in;

public class ChangeValues {
    public static void main(String[] args) {
        int[] arr = {13, 25, 20, 15, 28};
        change(arr);
        System.out.println(Arrays.toString(arr));

//        Scanner scanner = new Scanner(in);
//        System.out.println("Please enter an array :");
//        int n = scanner.nextInt();
//        int []arr = new int[n];
//        System.out.println("Please enter " + n + "integers :");
//        for(int i = 0; i < n; i++){
//            arr[i] = scanner.nextInt();
//        }
//        change(arr);
//        System.out.println("Modified array is : " + Arrays.toString(arr));
    }

        static void change( int[] nums){
            nums[0] = 99;

            }
//        }
    }
