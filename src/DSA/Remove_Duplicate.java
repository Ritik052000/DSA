package DSA;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate {
	
	public static Object[] removeDuplicate(int arr[])
	{
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		
		
		return s.toArray();
		
	}
	
	public static void main(String []args)
	{
		int arr[]= {1,1,2,3,3,4,5,5};
		
		Object[] brr=removeDuplicate(arr);
		for(int i=0;i<brr.length;i++)
		{
			System.out.println(brr[i]+" ");
		}
	}
	
	

}
