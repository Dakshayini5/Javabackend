package com.assignment1;
import java.util.Scanner;

public class octalTodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String octal = sc.next();
        int decimal = 0, power = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * power;
            power *= 8;
        }
        System.out.println(decimal);
        sc.close();
    }
}