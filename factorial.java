package com.assignment1;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), fact = 1;
        for (int i = 2; i <= num; i++) fact *= i;
        System.out.println(fact);
    }
}
