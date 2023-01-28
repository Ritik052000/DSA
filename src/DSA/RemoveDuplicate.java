package DSA;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
	
	
	public static String RemoveDuplicate(String str)
	{
		HashSet<Character> temp=new HashSet<>();
 		
		
		for(int i=0;i<str.length();i++)
		{
			temp.add(str.charAt(i));
		}
		
	   String res=new String(temp.toString());
	   return res;
	
	}
	
	
	public static void main(String [] args)
	{
		System.out.println(RemoveDuplicate("baabbcdd"));
	}
	

}
