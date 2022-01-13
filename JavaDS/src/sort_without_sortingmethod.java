import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;
public class sort_without_sortingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array ");
		int n = sc.nextInt();
		int a[] = new int[n];
//		int a[]= {0,2,1,2,0}
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt();
			if (d < 3) {
				a[i] = d;
			} else {
				System.out.println("please enter in range 0-2 for sorting ");
				break;
			}

		}
		for (int e : a)
			System.out.print(e + " ");
		System.out.println();
		

		for (int j = 0; j < n; j++) {
			int min_idx = j;
			for (int k = j + 1; k < n; k++) {
				if (a[j] > a[k]) {
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				} // if end
				else {
					continue;
				}

			}
		}
		
		for (int e : a)
			System.out.print(e + " ");
	}
}
