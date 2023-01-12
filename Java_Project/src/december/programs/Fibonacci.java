package december.programs;

public class Fibonacci {
	
	public static void main(String[] args)
	{
		
		Fibonacci obj = new Fibonacci();
		obj.print_fibonacci(1000);
		System.out.println();
		obj.print_fibonacci_between(50,1000);
	}

	
	void print_fibonacci(int no) {
		
		
		int first,second;
		first = 0; second = 1;
		
		while(first<no)
		{
		
			System.out.print(first+" ");
			first = second - first; 
			second = first+second ;
		}
		
		
	}
	
	void print_fibonacci_between(int no1, int no2)
	{
	
		int first,second;
		first = 0; second = 1;
		
		while(first<=no2)
		{
			if(first>50)
			{
			System.out.print(first+" ");

			}
			first = second - first; 
			second = first+second ;
		}
		
		
	}
}
