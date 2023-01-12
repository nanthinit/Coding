package december.programs;

public class PrimeNoofFibonacci {
	
	public static void main(String[] args)
	{
		PrimeNoofFibonacci obj = new PrimeNoofFibonacci();
		
		obj.prime_no_of_fibonacci(1000);
		
	}
	
	

	void prime_no_of_fibonacci(int no)
	{
		
		int first = 0, second = 1,i,prime ;
		
		while(first<no)
		{
			
			if(first >=2)
			{
				prime = 1;
				i = 2;
				
				while(i<first)
				{
					if(first%i ==0)
					{
						prime = 0;
						break;
					}
					i = i+1;
					
				}
				
				if(prime == 1)
				{
					System.out.println(first);
				}
			}
			
			first = second - first;
			second = first + second;
			

			 
		}
		
	}
}
