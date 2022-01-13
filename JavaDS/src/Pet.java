import java.util.*;
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int b = sc.nextInt();
int g = sc.nextInt();
int p = sc.nextInt();

if(b==p || g == p)
{System.out.println(p);
System.exit(0);}


int group = 0;
if(b>0 && g>0) {
	
	int min = Math.min(g, b);
	boolean boy_flag = false , girl_flag = false;
	if(min == b) boy_flag = true;
	else girl_flag = true;
	int count = 0;
	
	
	
	
  for(int i=0; i<min ; i++) {
	  int c = 1;
	  boolean f = false;
	  if(p>0) {
		 p = p - 1;
		 c = c + 1;
		 f = true;
	  }
	  if(boy_flag) {
		  if(f) {
		  b = b-1;
		  c = c + 1;}
		  else {b = b-2;
		     c = c + 2;}
		  
	  }
	  if(girl_flag) {
		  if(f) { 
		  g = g-1;
		  c = c + 1;}
		  else {b = b-2;
		     c = c + 2;}
	  }
	  
	  if(c==3)
		  count++;
	  if(b==0 || g==0)
		  break;
	  
  }
	
	System.out.print(count);
	
}//if ends here
else {
	System.out.print(0);
} // else ends here


	}

}
