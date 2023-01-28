package DSA;

import java.util.Stack;

public class sortStack {
	
	
	public static Stack<Integer> SortTheStack(Stack<Integer> s)
	{
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		
		
		s1.push(s.peek());
		s.pop();
		
         while(!s.isEmpty())
		{
			if(s.peek()>=s1.peek())
			{
				int temp=s.peek();
				s.pop();
				s1.push(temp);
			}
			else
			{
				while(s1.peek()>s.peek() || !s1.isEmpty())
				{
					s2.push(s1.peek());
					s1.pop();
				}
				
				
				 s1.push(s.peek());
				   s.pop();
			   while(!s2.isEmpty())
			   {
				 s1.push(s2.peek());
				 s2.pop();
			   }
				
			}
		}
		
		return s1;
	}
	
	
	
	public static void main(String []args)
	{
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(5);
		s.push(4);
		s.push(2);
		
		System.out.println(SortTheStack(s));
		
	}
	

}
