import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		List<Integer> s = new ArrayList<>();
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			s.add(a[i]);
		}
		Collections.sort(s);
		
		
		System.out.print(s.get(s.size()-2));
	
		
		
             
	}
	
	

}
