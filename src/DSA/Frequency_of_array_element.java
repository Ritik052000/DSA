package DSA;

import java.util.HashMap;

public class Frequency_of_array_element {
	
	
  public static void frequencyWithArray(int arr[])
  {
	  int[] count=new int[15];
	 
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  count[arr[i]]++;
	  }
	  
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println(count[arr[i]]);
	  }
	  
  }
  
  
  
  public static void frequencyWithSet(int arr[])
  {
	  HashMap<Integer,Integer> hp=new HashMap<>();
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  hp.put(arr[i],hp.getOrDefault(arr[i]+1, 0));
	  }
  }

}
