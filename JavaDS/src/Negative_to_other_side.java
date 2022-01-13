import java.util.*;

public class Negative_to_other_side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer>a = new ArrayList<>();
		List<Integer>b = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(arr[i]>=0)
				a.add(arr[i]);
			else
				b.add(arr[i]);
		}
		int d = 0;
		for(int i =0; i<a.size();i++) {
			arr[d++] = a.get(i);
		}
		for(int i =0; i<b.size();i++) {
			arr[d++] = b.get(i);
		}
//		System.out.print(arr.length+" here");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	} // end of moveNagative method

}
