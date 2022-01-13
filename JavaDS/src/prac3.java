

import java.util.*;
class Result1 {

	public static long repeatedString(String s, long n) {
		// Write your code here
		String str = "";
		for (long i = 0; i < n; i++) {

			str = str.concat(s);
		}

		String arr[] = str.split("");

		ArrayList<String> new_arr = new ArrayList<String>(Arrays.asList(arr));
		long c = 0;
		for (long j =n-1;j>-1; j--) {
			if (new_arr.get((int) j).equals("a")) {
				c = c + 1;
				}
		}
		return c;
	}

}

public class prac3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long n = sc.nextLong();

		long result = Result1.repeatedString(s, n);

		System.out.println(result);
		System.out.println(5/2);
	}
}
