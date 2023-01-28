package DSA;

public class Leader_In_Array {
	
	public static void Leader(int arr[])
	{   int n=arr.length;
		int leader=arr[n-1];
		System.out.print(leader+" ");
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>leader)
			{   leader=arr[i];
				System.out.print(leader+" ");
				
			}
		}
	}
	
	
	public static void main(String []args)
	{ //int arr[]= {7,10,4,10,6,5,2};
//	Leader(arr);
		String temp=""+1;
		System.out.println(temp);
	}

}
