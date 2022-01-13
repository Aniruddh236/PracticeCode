
import java.util.*;
class prac1 {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        String str="" ;
        //  String [] arr = new String[length];
        
        do{
           str=sc.next(); //How to take Stringofspecified character
        }
        while(str.length() != length);
        
       
        
String[] arr = str.split("");
System.out.println(arr.length);
     
int c= 0;        
        if(arr.length % 2 == 0){
           
            int d= length-1;
            for(int j = 0 ; j<length/2 ; j++){
                if(arr[j]==arr[d--]){
                    c++;
                }
            }
            System.out.println(c);
        }
        else if(arr.length==0){
             System.out.println(c);
        }
        else{
             int d= length-1;
            for(int j = 0 ; j< length/2 ; j++){
                if(arr[j]==arr[d--]){
                    c++;
                }
            }
    System.out.println(++c);
             }
    }
}
