package com.assignment1;

public class CheckPrimenumber {

	public static boolean CheckPrimeNumber(int num) {
		if(num < 2) {
			return false;
		}
		for(int i = 2; i < num/2; i++) {
		if(num % i == 0) {
			return false;
		}
		}
			return true;
	
	}
	public static void main (String[] args) {
		System.out.println(CheckPrimeNumber(2));	
		}
	}
