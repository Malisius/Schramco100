package net.sourceforge.malisius.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		int n = getDigit();
		System.out.println("Printing " + n + " digits of pi.");
		System.out.println(getPi(n));
	}
	
	public static int getDigit()
	{
		String input = JOptionPane.showInputDialog(null, "Enter number of digits to display");
		int n = Integer.parseInt(input);
		return n;
	}
	
	public static String getPi(int n) throws FileNotFoundException, IOException
	{
		String fin = "";
		
		try
		{
			InputStream in = new FileInputStream(new File("pi.txt"));
	        Reader reader = new InputStreamReader(in);

	        int c;
	        for(int x = 0; x < n; x++) 
	        {
	        	c = reader.read();
	            fin = fin.concat(String.valueOf((char) c));
	        }
	        
	        reader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return fin;
	}
}
