package com.assignment1;

import java.util.Scanner;

public class lCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = x, b = y;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int lcm = (x * y) / a;
        System.out.println(lcm);
        sc.close();
    }
}