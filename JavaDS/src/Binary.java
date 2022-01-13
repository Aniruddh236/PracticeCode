import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.print(binary(n));

	}

	public static int binary(int n) {
		int n1 = n;
		int c = 0;
		int r = 0;
		int b = 0;
		if (n1 % 2 == 0) {

			r = n1 % 2;
			b = n1 / 2;
			while (b > 0) {
//             	System.out.print("no");
				r = b % 2;
				b = b / 2;
				if (r % 2 == 1) {
					c++;
				}
			}
			return c;

		} else {
			c = 1;

			r = n1 % 2;
			b = n1 / 2;
			while (b > 0) {
//            	System.out.print("no");
				r = b % 2;
				b = b / 2;
				if (r % 2 == 1) {
					c++;
				}
			}
			return c;
		}

	}
}
