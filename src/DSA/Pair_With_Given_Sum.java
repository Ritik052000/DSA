package DSA;

import java.util.HashSet;

public class Pair_With_Given_Sum {
	
	
	public static boolean isPair(int arr[],int sum)
	{
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(sum-arr[i]))
			{
				return true;
			}
			else
				hs.add(arr[i]);
		}
		return false;
	}

}
