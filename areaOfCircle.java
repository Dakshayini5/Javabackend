package com.assignment1;
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(3.14159 * radius * radius);
        sc.close();
    }
}