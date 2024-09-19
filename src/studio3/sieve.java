package studio3;

import java.util.Scanner;

public class sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the number you want to find primes too.");
		int n = in.nextInt();
		int maxCheck = (int) Math.sqrt(n);
		int[] newArray = new int[n-1];
		
		for (int i =0; i < n-1; i++) {
			newArray[i] = i+2;
		}
		
		for (int j = 2; j<=maxCheck; j++) {
			for (int i = 0; i < newArray.length; i++) {
				if(newArray[i] != 0 && newArray[i]%j == 0 && newArray[i] != j) {
					newArray[i] = 0;
				}
			}
		
		}
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != 0) {
				System.out.println(newArray[i]);
			}
		}
	}
}
