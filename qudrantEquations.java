package com.assignment1;

import java.util.Scanner;

public class qudrantEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(root1 + " " + root2);
        } else if (d == 0) {
            double root = -b / (2.0 * a);
            System.out.println(root);
        } else {
            System.out.println("No Real Roots");
        }
        sc.close();
    }
}