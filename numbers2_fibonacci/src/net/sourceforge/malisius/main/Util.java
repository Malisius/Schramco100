package net.sourceforge.malisius.main;

public class Util 
{
	public static int getNth(int x)
	{
		if(x == 1 || x == 2) return 1;
		if(x < 1) return 0;
		
		int fin = 0;
		
		int current = 1;
		int last = 1;
		
		for(int i = 2; i < x; i++)
		{
			fin = current + last;
			last = current;
			current = fin;
		}
		
		return fin;
	}
}
