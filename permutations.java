package com.assignment1;
import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int factN = 1, factNR = 1;
        for (int i = 1; i <= n; i++) factN *= i;
        for (int i = 1; i <= (n - r); i++) factNR *= i;
        System.out.println(factN / factNR);
        sc.close();
    }
}