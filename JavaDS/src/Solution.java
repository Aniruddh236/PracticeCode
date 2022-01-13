import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static class Result {
		
		public static int getScoreDifference(List<Integer> numSeq) {
		    // Write your code here
		int diff = 0 ;
		int first_score = 0 ,second_score=0;
		for(int i=0;i<numSeq.size();i++){
		    int j=0;
		    int d=0;
		    if(i%2==0){
		         d=numSeq.get(j);
		            if(d%2==0){
		                numSeq.remove(j);
		                numSeq=reverse(numSeq);
		                for(int e: numSeq) {
		                	System.out.print(e+" ");
		                }
		                System.out.println();
		                first_score+=d;
		            }
		            else{
		                numSeq.remove(j);
		                for(int e: numSeq) {
		                	System.out.print(e+" ");
		                }
		                System.out.println();
		                first_score+=d;
		            }
		                
		    }
		    else{
		        d=numSeq.get(j);
		            if(d%2==0){
		                numSeq.remove(j);
		                numSeq=reverse(numSeq);
		                for(int e: numSeq) {
		                	System.out.print(e+" ");
		                }
		                System.out.println();
		                second_score+=d;
		            }
		            else{
		                numSeq.remove(j);
		                for(int e: numSeq) {
		                	System.out.print(e+" ");
		                }
		                System.out.println();
		                second_score+=d;
		            }
		    }
		   
		}
		diff = first_score - second_score;

		return diff;

		    }
		    
		    public static List <Integer> reverse(List <Integer> arr){
		        List <Integer> temp = new ArrayList<>();
		        int l =arr.size()-1;
		        for(int i =0;i<arr.size();i++){
		            temp.add(arr.get(l--));
		            
		        }
		        
		       
		        return temp;
		        
		    }


	}

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			List<Integer> arr = new ArrayList<>();
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++) {
				arr.add(sc.nextInt());
			}
			System.out.println(arr.get(2));
			int result =Result.getScoreDifference(arr);
			System.out.println(result);
		}
	}


