package DSA;

public class PrimeOrNot {
	
	
	public static boolean IsPrime(int num)
	{
		if(num==1)
			return false;
		else if(num==2||num==3)
			return true;
		
		
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
			
	}
	
	
	public static void main(String []args)
	{
		
	 System.out.println(IsPrime(17));
		
	}


}
