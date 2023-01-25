package december.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		ExceptionHandlingDemo obj = new ExceptionHandlingDemo();
		obj.division();
		obj.multiplication();
	}

	void division()
	{
		System.out.println("Enter numbers");
		Scanner sc = new Scanner(System.in);
		try {
			//Exception happens Area
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int[] ar = new int[no2];
		for(int i = 0; i<=10; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(no1/no2);
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Please enter proper numbers");
			//Handling Area
		}
		catch(InputMismatchException in)
		{
			System.out.println("Enter Integer numbers");
		}
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException nas)
		{
			System.out.println("Issue with array length");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}

	}
	
	void multiplication()
	{
		System.out.println("Multiplications");
	}
}
