package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();

			s.push(5);
			s.push(65);
			s.push(40);
			s.push(45);
			s.push(56);
			s.push(95);
			s.push(52);
			
			
		System.out.println("The Stack is " + s);
		
		System.out.println("This is the pop of a stack : "+s.pop());
		System.out.println("Current Stack : "+s);
		System.out.println("This is the peek : "+ s.peek());
		System.out.println("Current Stack : "+s);
		
//		System.out.println("Is the Stack is Empty : "+s.empty());
		
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
//		s.pop();
//		
		
		boolean Status = s.empty();
		System.out.println("Is the Stack is Empty : "+Status);
		
		int IndexFound = s.search(56);
		System.out.println(IndexFound);
		
		Iterator i= s.iterator();
		System.out.println(i);
		while (i.hasNext()) 
		{
			Object s1 = i.next();
			System.out.print(s1);
		}
		
	}
}

