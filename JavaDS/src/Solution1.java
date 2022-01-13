import java.util.Scanner;

class Solution1 {
    public static int romanToInt(String s) {
        int r = 0;
       
        for(int i=s.length()-1;i>-1;i--){
           if(s.charAt(i)=='I') 
               r += 1;
           else if(s.charAt(i)=='V')
           {
               if(i-1 < s.length() && i-1 >-1){
                   if(s.charAt(i-1)=='I')
                   { r += 4;
                   i--;
                   } else{
                   r+=5;
                     }
               }
               else{
                   r+=5;
               }
               
               
           }
           else if(s.charAt(i)=='X')
           {
              
               if(i-1 < s.length() && i-1 >-1){
                   if(s.charAt(i-1)=='I')
                   { r += 9; i--;} else{
                   r+=10;
                         } 
               }
               else{
                   r+=10;
               } 
               
               
           }
           else if(s.charAt(i)=='L')
           {
                if(i-1 < s.length() && i-1 >-1){
                   if(s.charAt(i-1)=='X')
                   { r += 40;
                       i--;
                   }else r+=50;
               }else r+=50;
            }
           else if(s.charAt(i)=='C')
                 {
                if(i-1 < s.length() && i-1 >-1){
                   if(s.charAt(i-1)=='X')
                   { r += 90;
                       i--;
                   }else r+=100;
               }else r+=100;
            }
            else if(s.charAt(i)=='D')
                 {
                if(i-1 < s.length() && i-1 >-1){
                   if(s.charAt(i-1)=='C')
                   { r += 400;
                       i--;
                   }else r+=500;
               }else r+=500;
            }
            else
                 {
                if(i-1 < s.length() && i-1 >-1){
                   if(s.charAt(i-1)=='C')
                   { r += 900;
                       i--;
                   }else r+=1000;
               }else r+=1000;
            }
            
            
            
            
           
            
            
            
            
        }
         return r;
    }
    
    
    
    
    public static void main(String arg[]) {
    	Scanner sc = new Scanner(System.in);
    	String str = "CM";
    	System.out.println(romanToInt(str));
    }
}