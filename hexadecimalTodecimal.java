package com.assignment1;

import java.util.Scanner;

public class hexadecimalTodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();
        int decimal = 0, power = 1;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            if (ch >= '0' && ch <= '9') {
                decimal += (ch - '0') * power;
            } else {
                decimal += (ch - 'A' + 10) * power;
            }
            power *= 16;
        }
        System.out.println(decimal);
        sc.close();
    }
}