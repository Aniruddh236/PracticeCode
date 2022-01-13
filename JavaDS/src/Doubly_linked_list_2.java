
public class Doubly_linked_list_2 {

	ListNode head = null;
	ListNode tail = null;
	int length;

	public class ListNode {
		int data;
		ListNode next;
		ListNode previous;
		
		public ListNode() {
			previous = null;
			next = null;
			
		}

		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

	}

	public void insertAtLastPosition(int data) {

		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		length++;

	}

	public void showList() {
		ListNode temp = head;
		if (head == null) {
			return;
		}

		while (temp != null) {
			System.out.print(temp.data + " -->");

			temp = temp.next;
		}

		System.out.println("null");

	}

	public void insertAtFirst(int data) {
		ListNode node = new ListNode(data);
		ListNode temp = new ListNode();
		if (head == null && tail == null) {
			head = node;
		} else {
			node.next = head;
			node.previous = null;
		}
		head = node;

	}

	
	public void deleteFirst() {
		
		if(head == null) {
			System.err.print("already empty list");
		}
		else {
			head = head.next;
						
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_linked_list_2 dll = new Doubly_linked_list_2();

		dll.insertAtLastPosition(10);
		dll.insertAtLastPosition(120);
		dll.insertAtLastPosition(125);
		dll.showList();
		dll.insertAtFirst(125);
		dll.showList();
		dll.deleteFirst();
		dll.showList();
		dll.deleteFirst();
		dll.showList();
		dll.deleteFirst();
		dll.showList();
		dll.deleteFirst();
//		dll.deleteFirst();
		

	}
}
