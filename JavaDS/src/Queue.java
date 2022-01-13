import java.util.NoSuchElementException;

public class Queue {
  private static int length;
  private Node front;
  private Node rear;
	
	public static  class  Node{
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static  boolean isEmpty() {
		 return length==0;
		
	}
	
	public void enqueue(int data) {
		
		Node temp = new Node(data);
		
		if(isEmpty()) {
			front = temp;
			}
		else {
		rear.next = temp;
		}
		rear = temp;
		length++;
		
	}
	
	public int dequeue() {
		
		int result;
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		}
		
		else {
		 result = front.data;
		 front = front.next;
		 if(front == null) {
			 rear = null;
		 }
		 length--;
		 
		}
		return result;
		
		
	}
	
	
	public void print() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		Node temp = front;
		 
		for(int i=0;i<length;i++) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	
	public int first() {
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		}
		return front.data;
	}
	
	public int last(){
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		}
		return rear.data;
		
	}
	Queue(){
		front = null;
		rear = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q =new Queue();
//		q.enqueue(10);
//		q.enqueue(11);
//		q.enqueue(12);
//		q.enqueue(103);
//		System.out.println(q.dequeue());
//		System.out.println(q.first());
//		System.out.println(q.last());
		q.print();
	}

}
