
public class Circular_Singly_Linklist {

	
	
	ListNode head = null;
	ListNode last = head;
	int length;
	public class ListNode{
		int data;
		ListNode next;
		
		public ListNode() {
			// TODO Auto-generated constructor stub
			next = null;
		}
		public ListNode(int data) {
			this.data = data;
			next = null;
		}
		
	}
	
	public void insert(int data) {
		
		ListNode node = new ListNode(data);
		ListNode temp = new ListNode();
		if(head == null) {
			return ;
		}
		else {
			temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp = node;
			node.next = head;
		}
		System.out.println("inserted...");
	}
	
	public void show() {
		ListNode temp = head;
//		temp = head;s
		int c= 0;
		while(temp!=head || c<=0 ) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
			c++;
		}
		System.out.println("showing.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circular_Singly_Linklist cll =new Circular_Singly_Linklist();
		cll.insert(10);
		cll.insert(150);
		
		cll.show();

	}
	
	
	

}
