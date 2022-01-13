


import java.io.*;
import java.util.*;

public class HackerRank1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> a  = new TreeMap<>();
        ArrayList<Integer> d = new ArrayList<>();
        double s = 0;
        for(int i=0;i<n;i++){
            int l = sc.nextInt();
            s = s + l;
            
            d.add(l);
        }
        
        Collections.sort(d);
        for(int i=0;i<n;i++){
            int l = d.get(i);
            
            if(a.containsKey(l))
                a.put(l,a.get(l)+1);
            else
              a.put(l,1);
              
              System.out.println(a);
        }
//        a.put(1, 2);
//        System.out.println(a);
        double mi = s/n;
        double me = (d.get(n/2)+d.get((n/2)-1))/2;
        double mo = 0.0;
        double j = 0 ,store = 0;
        for(int i=0;i<n;i++){
        	System.out.println(d.get(i));
            j = Math.max(j , a.get(d.get(i)));
            
            store = (j <= a.get(d.get(i)))? d.get(i) : store ;
        }
        // System.out.println(d); 
        // System.out.println(a);
        System.out.println(mi);
        System.out.println(me);
        System.out.println(store);
        
    }
    
    
}