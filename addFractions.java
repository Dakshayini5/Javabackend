package com.assignment1;
import java.util.Scanner;

public class addFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        int lcm = den1 > den2 ? den1 : den2;
        while (true) {
            if (lcm % den1 == 0 && lcm % den2 == 0) break;
            lcm++;
        }
        int numerator = (num1 * (lcm / den1)) + (num2 * (lcm / den2));
        System.out.println(numerator + "/" + lcm);
        sc.close();
    }
}