import java.util.Scanner;

public class TCS_Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
  int limit1 = sc.nextInt();
  int limit2 = sc.nextInt();
  int s = 0 , c = 0;
  for(int i=0;i<5;i++) {
	  if(limit1<a[i] && limit2>a[i]) {
		  s += a[i];
		  c++;
	  }
  }
  
  System.out.println(s/c);
  
	}

}
