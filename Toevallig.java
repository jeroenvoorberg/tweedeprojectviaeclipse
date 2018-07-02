package demo;

import java.util.Random;

class Toevallig 
{
	public static void main(String[] args)
	{
		
	dobbelstEenteller();

	}

	static void dobbelstEenteller()
	{
		int tel;
		tel = 0;
		
		for (int i = 1; i <= 100; i++)
		{
			Random toeval = new Random();
			int getal = toeval.nextInt(6) + 1;
			
			if(getal == 1)
				{
				tel = tel + 1;			
				}
			
		}
		System.out.println(tel);
	}	
}
	
	
	

