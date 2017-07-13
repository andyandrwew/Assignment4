package assignment4;

import java.util.Random;

public class BubbleSort
{
	int[] sortedList;
	public BubbleSort(int[] list)
	{		
		for (int i = 0; i < list.length - 1; i++)
		{
			for(int j = i; j < list.length - 1; j++)
			{
				if (list[i] > list[j])
				{
					int temp = list[i];
					
					list[i] = list[j];
					list [j] = temp;
				}
			}
		}
		
	}
	
	static class Tester
	{
		public static void main(String[] args)
		{
			int[] randArray = new int[10];
			Random rand = new Random();
			
			for(int i = 0; i < randArray.length - 1; i++)
			{
				randArray[i] = rand.nextInt();
			}
			
			
			new BubbleSort(randArray);
			
			for(int i = 0; i < randArray.length - 1; i++)
			{
				System.out.println(randArray[i]);
			}
		}
	}
}
