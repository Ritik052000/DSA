package DSA;

public class Kth_Bit_Set_Or_Not {
	
	public static boolean IsSet(int num,int k)
	{
		if((num&(1<<(k-1)))!=0)
			return true;
		else
			return false;
	}
	
	public static void main(String []args)
	{
		System.out.println(IsSet(5,1));
	}

}
