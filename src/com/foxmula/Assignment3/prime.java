package com.foxmula.Assignment3;
import java.util.*;

class primeexcep extends Exception
{
	public primeexcep(String x)
	{
		System.out.println(x);
	}
}
public class prime {
	
	void expcheck(int num) throws primeexcep
	{
		int state=0;
		for (int i=2; i<num; i++) 
		{
			if(num%i==0)
				state=1;
			
		}
		
		if(state==0 && num%2 != 0)
			{
			throw new primeexcep("Number is invalid");
		
			}
		else 
		{
			System.out.println("Number is valid");
		}
			
			
		
	}
	
	//main function
	
	public static void main(String args[])
	{
		//variables
		int number, select;
		prime obj1 = new prime();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 for Input");
		
		while(true)
		{
			select = scan.nextInt();
			
			switch(select)
			{
			case 1:System.out.println("Enter Number");
					number = scan.nextInt();
					try
					{
						obj1.expcheck(number);
					}
					
					catch(primeexcep ex)
					{
						System.out.println("Exception tested succesfully");
					}
					
					
			}
		}
	}
	

}
