package com.assignment1;
import java.util.Scanner;

public class decimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String hex = "";
        while (decimal > 0) {
            int rem = decimal % 16;
            if (rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char) ('A' + rem - 10) + hex;
            }
            decimal /= 16;
        }
        System.out.println(hex);
        sc.close();
    }
}