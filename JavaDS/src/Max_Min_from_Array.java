import java.util.Scanner;
public class Max_Min_from_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[];
		int b[];
		int n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		
		
	 System.out.print("Enter element for Array /n");
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
		 b[i]=a[i];
	 }
	 int min=a[0];
		for(int k=0;k<n;k++) {
			if(min>a[k])
				min=a[k];
			else
				min=min;
		}
		System.out.println(min);
		 int max=a[0];
			for(int k=0;k<n;k++) {
				if(max<a[k])
					max=a[k];
				else
					max=max;
			}
			System.out.println(max);
	}

}
