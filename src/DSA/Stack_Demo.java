package DSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Demo {

	
	public static void main(String []args)
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		 
		
//	  System.out.println(stack.peek()); 
//	  System.out.println(stack.isEmpty());
//	  System.out.println(stack.contains(1));
//	  
	  
	  
	  Queue<Integer> q = new LinkedList<>();
	  q.add(1);
	  q.add(2);
	  q.add(3);
	  
	  System.out.println(q.peek());
	  System.out.println(q.remove());
	  System.out.println(q.peek());
	  
	 
	  
	}
}
