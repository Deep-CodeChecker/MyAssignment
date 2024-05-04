package week1.day1;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		
				
		 int[] arr={1,4,3,2,8,6,7}; // {1,2,3,4,6,7,8}
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length-1;i++)
	        {
	        	//System.out.println(i);	        	
	        	//System.out.println(arr[i]);
	        	
	        	System.out.println("i = "+i+";LHS: " + (arr[i]+1));
	        	System.out.println("arr[i+1] = "+arr[i+1]+";RHS: " + arr[i+1]);	        		        
	      
	            if(arr[i]+1!=arr[i+1])
	            {
	            	System.out.println("inequal");
	                System.out.println(arr[i]+1);
	                break;	
	            }
	            else {
	            	System.out.println("both equal");
	            }
	        }
	        
	}
}


