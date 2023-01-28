package DSA;

public class Odd_Occuring_Number {
	
	public static int OddNumber(int arr[])
	{   int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res=res^arr[i];
		}
		return res;
	}
	
	
	
	
	public static void main(String [] args)
	{
		
		int arr[]= {4,3,4,3};
		System.out.println(OddNumber(arr));
	}

}
