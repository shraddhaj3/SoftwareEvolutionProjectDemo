package com.prime;
public class Prime {
	public static void main(String[] args) {

		int num = 9;
		System.out.println("NUMBER "+ num + " IS " + (isPrime(num)==true?"PRIME":"NOT PRIME"));
	}

	private static boolean isPrime(int n) {
		// check if number is positive
		if (n <= 1)
			return false;
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
