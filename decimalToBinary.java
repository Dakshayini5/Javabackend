package com.assignment1;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        System.out.println(binary);
        sc.close();
    }
}