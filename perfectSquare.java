package com.assignment1;
import java.util.Scanner;
public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Math.sqrt(num) % 1 == 0 ? "Perfect Square" : "Not Perfect Square");
    }
}