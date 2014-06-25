// Jake Hackim
// June 25th 2014

import java.util.*;
import java.awt.*;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])												//MAIN class
	{
		Scanner input = new Scanner(System.in);
		
		double cost;
		double width;
		double height;
		double total_cost;
		
		cost = askForTileCost(input);
		
		width = askForWidth(input);
		
		height = askForHeight(input);
		
		total_cost = calculateCost(cost, width, height);
		
		outputCost(total_cost);
	}
	
	public static double askForTileCost(Scanner input)									//asking for tile cost
	{
		System.out.print("Please enter the cost of the tiles.\n:$");
		return input.nextDouble();
	}
	
	public static double askForWidth(Scanner input)										//asking for width
	{
		System.out.print("Please enter the width of the floor.\n:");
		return input.nextDouble();
	}
	
	public static double askForHeight(Scanner input)									//asking for height
	{
		System.out.print("Please enter the height/length of the floor.\n:");
		return input.nextDouble();
	}
	
	public static double calculateCost(double cost, double width, double height)		//calculating cost
	{
		return cost * width * height;
	}
	
	public static void outputCost(double total_cost)									//outputting formatted total cost (%.__)
	{
		System.out.print("The total cost of tiling for this floor is $");
		System.out.printf("%.2f", total_cost);
		System.out.print(".\n");
	}
}