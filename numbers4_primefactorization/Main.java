package com.peteroertel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	public static Factor treeTop;
	
	public static void main(String[] args) {
		long number = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(number == 0) {
			System.out.println("Enter number to factor: ");
			String input = "";
			
			try {
				input = reader.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				number = Long.parseLong(input);
				treeTop = new Factor(number);
				System.out.print("Prime Factors: ");
				treeTop.outputTree();
				reader.close();
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number.");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
