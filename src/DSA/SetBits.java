package DSA;

public class SetBits {
	
	public static int SetBits(int num)
	{
		int res=0;
		while(num>0)
		{
			
				res++;
			num=num&num-1;
		}
		return res;
	}
	
	
	
	public static void main(String [] args)
	{
		System.out.println(SetBits(5));
	}

}
