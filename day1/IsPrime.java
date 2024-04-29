package week1.day1;
//Prime number is a number that is greater than 1 and divided by 1 or number itself.
public class IsPrime {
	public static void main(String[] args){
		int num=12;

		boolean isPrime=true;
		 for(int i=2;i<=num;i++) // i=2 because the prime number is divisible by 1 or the number itself so we know 1 and 25 are prime numbers
		 {			 
			 if(num%2== 0)
			{
				isPrime = false;
				 break;
			 }
		 }
		if(isPrime)
		{
			System.out.println("the given number is a prime");
			
		}
		else
		{
			System.out.println("The given number is not a prime");
		}
	}

}
