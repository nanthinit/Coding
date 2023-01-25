package december.programs;

import java.util.Scanner;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		
		ExceptionHandlingDemo2 obj = new ExceptionHandlingDemo2();
		obj.division();

	}
	void division()
	{
		System.out.println("Enter numbers");
		Scanner sc = new Scanner(System.in);
		try {
			//Exception happens Area
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		System.out.println(no1/no2);
		}
		catch(Exception e)
		{
			System.out.println("Check numbers");
		}
		finally
		{
			System.out.println("Thanks for your input");
		}
		
		
		try {
		System.out.println("Hi");
		}
		catch(Exception e)
		{
			
		}
	}
}
