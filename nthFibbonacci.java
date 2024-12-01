package com.assignment1;
import java.util.Scanner;
public class nthFibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 1, result = 0;
        for (int i = 1; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        System.out.println(n == 1 ? 0 : result);
    }
}