package com.peteroertel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		int primeNumber = 2;
		while(true) {
			System.out.println("Press enter for next prime.");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String garbage = reader.readLine();
			
			boolean prime = false;
			
			while(!prime) {
				if(new Factor(primeNumber).left == null) {
					System.out.println(primeNumber);
					prime = true;
				} 
				primeNumber++;
			}
		}
	}

}
