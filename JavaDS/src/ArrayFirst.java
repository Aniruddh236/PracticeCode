import java.util.Scanner;

public class ArrayFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a;
		System.out.print("enter size");
		Integer n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int e : a)
			System.out.print(e + " ");
	}

}
