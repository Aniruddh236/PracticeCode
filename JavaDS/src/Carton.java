import java.util.*;
public class Carton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int k = sc.nextInt();
ArrayList<Integer>a = new ArrayList<>();
int s = 0;
for(int i = 0; i<n ; i++)
{
	int d = sc.nextInt();
	a.add(i,d);
	s = s+a.get(i);
	}

//if(s%k==0)
//	{System.out.print(s/k);
//    System.exit(0);}
Collections.sort(a);
Collections.reverse(a);
int count = 0 , l = 0 ,c=0;
for(int i=0; i<n; i++) {
	
	c = c + a.get(i);
	l++;
	if(c==k && l<=2)
		{c=0;
		l = 0;
		count++;}
	
	if(i==n-1 && c>0)
		count++;
}


System.out.print(count);
	}

}
