import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result{

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static void sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    
    List<Integer>storage = new ArrayList<>();
    //store unique element in storage
    for(int i=0;i<ar.size();i++){
        if(storage.isEmpty()== true){
            storage.add(ar.get(i));
        }
        if(check(storage,ar.get(i))){
            continue;
        }
        else{
            storage.add(ar.get(i));
        }
    }
    
    //extra------------------------------------------------
//    for(int e: storage){
//        System.out.print(e+" ");
//    }
//    System.out.println();
    //-------------------------------------------------------
    int  sum = 0;
    
    for(int j=0;j<storage.size();j++) {
    	int count = 0;
    	for(int  k=0;k<n;k++) {
    		if(ar.get(k)==storage.get(j)) {
    			count++;
    		}
    		else {
    			continue;
    		}
    	}
    	if(count>1) {
    		sum = sum + (count/2);
    	}
    }
    
    System.out.print(sum);
  }


public static boolean check(List<Integer> al , int e){
    for(int i=0;i<al.size();i++){
        if(al.get(i)==e){
            return true;
        }
    }
    return false;
  }
}
public class prac2 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> ar = new ArrayList<>();
//            .map(Integer::parseInt)
//            .collect(toList());
        for(int i=0;i<n;i++) {
        	ar.add(sc.nextInt());
        }

        // int result = 0;
        Result.sockMerchant(n, ar);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
