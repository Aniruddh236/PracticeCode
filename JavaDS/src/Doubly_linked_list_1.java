
public class Doubly_linked_list_1 {
	
	public ListNode head;
	private ListNode tail;
	private int length;

	public class ListNode {
		int data;
		ListNode next;
		ListNode previous;

		public ListNode(int data) {
			this.data = data;
			// TODO Auto-generated constructor stub
		}
	}
	
	
public Doubly_linked_list_1() {
	// TODO Auto-generated constructor stub
	
	this.head = null;
	this.tail = null;
	this.length = 0;
}

public void insertNode(int data) {
	
	ListNode node = new ListNode(data);
	if(head == null && tail==null) {
		head = node;
	}
	else {
		tail.next = node;
		
	}
	node.previous = tail;
	tail = node;
	length++;
}

public boolean isEmpy() {
	return length == 0;
}

public void showList() {
	ListNode temp = head;
	if(head == null) {
		return;
	}
	
	while(temp!=null) {
		System.out.print(temp.data+" -->");
		
		temp = temp.next;
	}

	System.out.println("null");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_linked_list_1 dll = new Doubly_linked_list_1();
		dll.insertNode(10);
		dll.insertNode(11);
		dll.insertNode(12);
		dll.showList();
		System.out.println( dll.isEmpy() +" "+ dll.length);
	}

}
