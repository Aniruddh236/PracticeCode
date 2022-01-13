import java.util.EmptyStackException;

public class Stack {
	
	static Node top;
	static int length;
	
	Stack(){
		this.top = null;
		this.length = 0;
		
	}
	
	public static class Node{
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	static boolean isEmpty(){
		
		return length==0;
	}
	
	static void push(int data) {
		Node temp =new Node(data);
		temp.next = top;   /////this is the logic
		top = temp;
		length++;
		
	}
	
	static int pop() {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		int result = top.data;
		top = top.next;
		
		length--;
		return result;
		
		
	}
	
	static int peek() {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(10);
		s.push(102);
		s.push(110);
		System.out.println(s.peek());
		System.err.println(s.pop());
		System.out.println(s.peek());
		System.err.println(s.pop());
		System.err.println(s.pop());
		System.err.println(s.pop());

	}

}
