package DSA;

public class TrailingZero {
	

	public static int trailingzero(int num)
	{ int res=0;
		for (int i=5;i<num;i*=5)
		{
			res=res+(int)(Math.floor(num/i));
		}
		
		return res;
		
	}
	
	
	public static void main(String []args)
	{
		
	System.out.println(trailingzero(10));
		
		
	}

}
