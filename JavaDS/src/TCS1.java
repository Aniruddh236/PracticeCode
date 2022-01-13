//return coordinate after the round
import java.util.*;
public class TCS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int i=0 , i_count=1;
		int j=0 , j_count=1;
		
		
		
		for(int k=1;k<n+1;k++) {
			//for x coordinate
			if(k%2!=0) {
				if(i_count%2!=0) {
					i+=k*10;
					i_count++;
				}else
					{i-=k*10;
					i_count++;}
					
				
			}else {
				// for y coordinate
				if(j_count%2!=0)
					{
					j+=k*10;
					j_count++;
					}
				else
					{j-=k*10;
					j_count++;
					}
				
			}
			
			
		}
  System.out.print(i+" "+j);
	}

}
