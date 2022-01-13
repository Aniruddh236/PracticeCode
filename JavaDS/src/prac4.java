import java.util.Scanner;

public class prac4 {

	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int [][]b=new int[4][4]; //hour glass value
		int [][]a=new int[6][6];
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				b[i][j]= a[i][j]+a[i][j+1]+a[i][j+2]   +  a[i+1][j+2]  + a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
			}
		}
		
		int max=0;
		for(int k=0;k<4;k++) {
			for(int l=0;l<4;l++) {
				if(b[k][l]>max) {
					max = b[k][l];
				}
			}
		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				if(max==a[i][j]+a[i][j+1]+a[i][j+2]   +  a[i+1][j+2]  + a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]) {
//					System.out.println(a[i][j]+" "+a[i][j+1]+" "+a[i][j+2] );
//					System.out.println("   "+a[i+1][j+2]+"  ");
//					System.out.println(a[i+2][j]+" "+a[i+2][j+1]+" "+a[i+2][j+2]);
//			}
//		}
		
	}
}
