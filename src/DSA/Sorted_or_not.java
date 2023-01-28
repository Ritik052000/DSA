package DSA;

public class Sorted_or_not {
	
	public static boolean IsSorted(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<arr[i-1])
				return false;
		
		}
		return true;
		
	}
	
	
	public static void main(String []args)
	{  
		
		int arr[]= {1,2,3,6,5};
		System.out.println(IsSorted(arr));
	}

}
