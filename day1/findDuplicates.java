package week1.day1;

//import java.lang.reflect.Array;

public class findDuplicates {
	public static void main (String[] args) {
		
		int[] num=new int[] {2,5,7,7,5,9,2,3};
		System.out.println("Duplicate elements in given array: ");  
 for(int i=0; i< num.length;i++) {
	 for(int j=i+1; j<num.length; j++) {
		 
		 if(num[i]==num[j])
			 System.out.println(num[j]);  
			
			 
		 
		 
	 }
 }
}
	
}
