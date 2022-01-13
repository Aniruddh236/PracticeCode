
import java.util.Scanner;
public class Union_InterSection_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of two array");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int a[]=new int[n1];
		int b[]=new int[n2];
		System.out.println("enter  array 1 ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter  array 2 ");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		
		//sorting array a and b
		
		for (int j = 0; j < n1; j++) {
			int min_idx = j;
			for (int k = j + 1; k < n1; k++) {
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
		
		for (int j = 0; j < n2; j++) {
			int min_idx = j;
			for (int k = j + 1; k < n2; k++) {
				if (b[j] > b[k]) {
					int temp = b[j];
					b[j] = b[k];
					b[k] = temp;
				} // if end
				else {
					continue;
				}

			}
		}
		for(int e:a) {System.out.print(e+" ");}
		for(int e:b) {System.out.print(e+" ");}
		System.out.println();
		System.out.println("--------new array is-------------------");
		int c[]=new int[n1+n2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<a.length;j++) {
				c[j]=a[j];
				
			}
			int l=0;
			for(int k=a.length;k<b.length+a.length-2;k++) {
				c[k]=b[l];
				l++;
			}
			
		}
		
		for(int e: c) {
			
			System.out.print(e+" ");
		}
	
	
	}
}
