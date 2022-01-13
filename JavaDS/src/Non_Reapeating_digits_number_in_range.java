import java.util.*;

public class Non_Reapeating_digits_number_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int c = 0;
		
		for(int i=n1 ; i<=n2 ; i++) {
			
			int n = i;
			HashSet<Integer> hs = new HashSet<>();
			while(n>0) {
				int s = n%10 ;
				if(hs.contains(s)) {c++; break;}
				hs.add(s);
				n = n/10;
				
			}//while
			
		}//for
		
		System.out.print(n2-n1-c+1);

	}

}
