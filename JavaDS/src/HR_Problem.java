import java.util.Scanner;

public class HR_Problem {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=n;
   
    int r=0;
   
    int c=0;
    int i=0;
    while(n>0){
        r=n%2;
        c++;
       n=n/2;
    }
    int a[]=new int[c];
    while(m>0){
        r=m%2;
        
       
        m=m/2;
        a[i]=r;
        i++;
    }
    int l[]=new int[c];
    for(int e: a) {
    	if(c>-1) {
    l[c-1]=e;
    c--;}
    }
//    for(int e: l) {
//    	System.out.print(e+" ");
//    }
//    System.out.println();
//    c=0;
//    for(int e: a) {
//    	if(e==1) {
//    		c++;
//    	}
//    	
//    }
//    System.out.println("total ones "+c);
    int e[]=new int[a.length];
    int d=1;
    int h=0;
    for(int k=0;k<l.length-1;k++) {
    	for(int j=k+1;j<k+2;j++) {
    		if(l[k]==1 && l[j]==1) {
    			d=d+1;
    			if(l[j+1]==0) {
    				
    				e[h]=d;
    				h=h+1;
    				d=0;
    			}
    		}
    	}
    }
    
    for(int k=h;k<e.length-h;k++) {
    	e[h]=0;
    }
    int max=0;
    for(int k=0;k<a.length;k++) {
    	if(e[k]>max) {
    	max=e[k];	
    	}
    	else {
    	 continue;
    	}
    }
    System.out.println(max);
    
    
  }
}
