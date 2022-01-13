import java.util.Scanner;

public class SinglyLinkedList {

	private static ListNode head;
	private static class ListNode{
		private  int data;
		private ListNode next;
		
		
		public ListNode(int data) {
			this.data  = data;
			this.next = null;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList sll = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(count < n) {
			if(sll.head == null) {
				head.data = sc.nextInt();
			
			}
			else {
				head.next = sc.nextInt();
			}
			sll.add(sc.nextInt());
			count++;
		}
		

	}

}
