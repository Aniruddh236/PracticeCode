import java.util.Scanner;
public class Kth_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[];
		int n=sc.nextInt();
//		int r[];
//		int b[];
//		int n=sc.nextInt();
		a=new int[n];
//		b=new int[n];
		
		
	 System.out.println("Enter element for Array");
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
//		 b[i]=a[i];
	 }
	 
	 System.out.println("enter to which element you want to find max and min ");
	 int n1=sc.nextInt();
	 
	 int c=0;
	 int min=a[0];
		int h=0	;
				while(c!=n1) {
				if(h<n) {
				 if(min>=a[h]) {
					min=a[h];
					c++;
					h++;
				 }
						
					
				 else {
					min=min;}
				}
				}
		System.out.println(n1+"th min is "+min);
			
	
		
	 int c1=0;
	 int max=a[0];
		int k=0	;
				while(c1!=n1) {
				 if(max<=a[k]) {
					max=a[k];
					c1++;
					k++;
				 }
						
					
				 else {
					max=max;}
				}
		System.out.println(n1+"th maximum is "+max);
			

	}

}
