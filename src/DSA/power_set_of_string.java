package DSA;

public class power_set_of_string {
	
	
	public static void powerSet(String str)
	{
		int n=str.length();
		int pow=(int) Math.pow(2, n);
		
		for(int counter=0;counter<pow;counter++)
		{
		  for(int j=0;j<n;j++)
		  {
			  if((counter&(1<<j))!=0)
			  {
				  System.out.print(str.charAt(j));
			  }
		  }
		  System.out.println("");
		  
		}
	}
	
	
	public static void main(String []args)
	{
		powerSet("abc");
	}

}
