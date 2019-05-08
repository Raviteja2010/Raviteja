package com.app.logicsArray;

public class FirstHalfMaxValue
{
  public static void main(String[] args)
  {
	  int[] x = {3, 6, 1, 0, 4, 6, 9};
		//middle in the first half.
		int max = x[2];
		for(int i = 0; i < x.length / 2; i++)
		{
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		System.out.println("max in the first half:" + max);	
  }
}
