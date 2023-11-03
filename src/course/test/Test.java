package course.test;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FILO
		Stack<Integer> a = new Stack<Integer>();
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a.pop());

		//FIFO
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.poll());
		
	}

}
