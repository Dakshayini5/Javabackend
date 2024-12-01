package com.assignment1;
import java.util.Scanner;
public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), exponent = sc.nextInt();
        System.out.println((int) Math.pow(base, exponent));
    }
}