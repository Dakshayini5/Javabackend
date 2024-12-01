package com.assignment1;
import java.util.Scanner;
public class armstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int sum = 0, temp = i, digits = String.valueOf(i).length();
            while (temp > 0) {
                sum += Math.pow(temp % 10, digits);
                temp /= 10;
            }
            if (sum == i) System.out.println(i);
        }
    }
}
