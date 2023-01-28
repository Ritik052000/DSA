package DSA;

public class Second_Largest_Element {
	
	public static int Secondlargest(int arr[])
	{
		int first=Math.max(arr[0],arr[1]);
		int second=Math.min(arr[0], arr[1]);
		
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>first)
			{   second=first;
				first=arr[i];
			}
			else if(arr[i]<first && arr[i]>second)
			{
				second=arr[i];
			}
		}
		
		
		return second;
		
	}
	
	
	public static void main(String [] args)
	{   int arr[]= {6,1,3,4,5,};
	    System.out.println(Secondlargest(arr));
		
	}
	

}
