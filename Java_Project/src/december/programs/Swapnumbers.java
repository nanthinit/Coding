package december.programs;

public class Swapnumbers {
	
	public static void main(String[] args)
	{
		
		Swapnumbers obj = new Swapnumbers();
		obj.swap_numbers(5, 2);
		obj.swap_numbers(10, 20, 30);
		
	}
	
	void swap_numbers(int a, int b)
	{
		
		System.out.println("Before swapping a = "+a);
		System.out.println("Before swapping b = "+b);
		System.out.println("****");
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping a = "+a);
		System.out.println("After swapping b = "+b);
		
		System.out.println("-------------------------------------");
				
	}
	
	void swap_numbers(int a, int b, int c)
	
	{
		System.out.println("Before swapping a = "+a);
		System.out.println("Before swapping b = "+b);
		System.out.println("Before swapping c = "+c);
		System.out.println("****");
		a = a+b+c;
		c = a-b-c;
		b = a-b-c;
		a = a-b-c;
		
		System.out.println("After swapping a = "+a);
		System.out.println("After swapping b = "+b);
		System.out.println("After swapping c = "+c);
		
		
		
		
		
	}
	

}
