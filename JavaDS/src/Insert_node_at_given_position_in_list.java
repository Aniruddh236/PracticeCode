import java.util.LinkedList;
import java.util.Scanner;

public class Insert_node_at_given_position_in_list {
	

	public static LinkedList<Integer> insertAt(LinkedList<Integer>list,int position,int data) 
	{
//		LinkedList<Integer> l = new LinkedList<Integer>();

		list.add(position,data);
		
		return list;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  =  sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		int c= 0;
		
		while(c<n) {
			list.add(sc.nextInt());
			c++;
		}
		
//		for(int e:list) {
//			System.out.print(e+" ");
//		}
//   System.out.println("enter position");
   int p = sc.nextInt();
//   System.out.println("enter data");
   int data = sc.nextInt();
   
   LinkedList<Integer> lisst = insertAt(list,p,data);

	for(int e:lisst) {
		System.out.print(e+" ");
	}
   
	}

}
