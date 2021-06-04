package com.foxmula.Assignment3;

import java.util.*;

public class frequency {

	ArrayList<Integer> arr = new ArrayList<Integer>();
	Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
	void input(int x)
	{
		arr.add(x);
	}
	
	void print()
	{
		int temp,value;
		
		int size=arr.size();
		for(int i=0; i<size; i++)
		{
			temp = arr.get(i);
			if(ht.contains(temp))
			{
				value = ht.get(temp);
				ht.replace(temp, value+1);
			}
			else
			{
				ht.put(temp, 1);
			}
		}
		
		//main work
		
		Set<Integer> keys = ht.keySet();
		int sizeset;
		sizeset = keys.size();
		
		for (int j=0; j<sizeset; j++)
		{
			Set<Integer> key2 = ht.keySet();
			Iterator<Integer> itr = key2.iterator();
			int max=0;
			
			while(itr.hasNext())
			{
				int tempvalue, tempkey;
				tempkey=itr.next();
				
				if(ht.get(tempkey)>=max)
				{
					max=tempkey;
					
				}
							
				
			}
			System.out.println("Key: "+max+" & Value: "+ht.get(max));
			ht.remove(max);
			
			
		}
		
	}
	
	public static void main(String args[])
	{
		
		//variables
		int select,num;
		frequency obj1 = new frequency();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 for Input");
		System.out.println("2 for print");
		
		while(true)
		{
			select = scan.nextInt();
			
			switch(select)
			{
			case 1:System.out.println("Enter Number");
					num = scan.nextInt();
					obj1.input(num);
					
			case 2: obj1.print();
					
			}
		}
	}
}
