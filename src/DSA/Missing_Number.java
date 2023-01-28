package DSA;

public class Missing_Number {
	
	public static int MissingNumber(int []arr,int num)
	{
		
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			res=res^arr[i];
		}
		
		for(int i=1;i<=num;i++)
		{
			res=res^i;
		}
		
		return res;
	}
	
	public static void main(String []args)
	{
		int arr[]= {1,4,3,2};
		
		System.out.println(MissingNumber(arr,5));
	}

}
