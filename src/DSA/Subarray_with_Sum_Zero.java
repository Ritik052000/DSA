package DSA;

import java.util.HashSet;

public class Subarray_with_Sum_Zero {

	public static boolean isZeroSum(int arr[])
	{
		HashSet<Integer> h=new HashSet<>();
	    int presum=0;
	  
	    for(int i=0;i<arr.length;i++) {
	    	
	    	presum+=arr[i];
	    	if(h.contains(presum))
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		h.add(presum);
	    	}
	    }
	    return false;
		
	}
	
	
	public static void main(String []args)
	{
		
		int arr[]= {3,2,8,15};
		System.out.println(isZeroSum(arr));
		
	}
	
	
	
	
}
