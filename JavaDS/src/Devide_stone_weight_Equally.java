import java.util.*;
public class Devide_stone_weight_Equally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
List<Integer> a = new ArrayList<>();
System.out.println("enter stone number ");
int n = sc.nextInt();
System.out.println("enter stone weight ");
int s = 0;
for(int i=0; i<n ; i++) {
	int d = sc.nextInt();
	s = s + d;
	a.add(d);
}
for(int i = 0 ; i<n ; i++) {
	System.out.print(a.get(i) + " ");
}
System.out.println();
System.out.println("s=" + s);


Collections.sort(a);
Collections.reverse(a);

if(s%2 == 0) {
	int h = s/2;
	System.out.println("h=" + h);
	for(int i=0 ; i < n; i++) {
		if(a.get(i)<=h) {
			{h = h - a.get(i);
			  if(h==0)
				  {System.out.print("True");
				  System.exit(0);
				   }
			}
		}
	}
	System.out.println("False");
}
else {
System.out.print("False");
}

	}

}
