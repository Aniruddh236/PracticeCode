import java.util.Scanner;
public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[];
		int n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int reverse[]=new int[n];
		int k=0;
		for(int j=a.length-1;j>=0;j--) {
			reverse[k]=a[j];
			k++;
		}
		for(int e:reverse) {
			System.out.print(e+" ");
		}
	}

}
