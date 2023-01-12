package december.programs;
import java.util.Scanner;

public class ArrayDemo {
	
	Scanner sc = new Scanner(System.in);
	int[] arr;
	
	public static void main(String[] args)
	{
		ArrayDemo obj = new ArrayDemo();
		//obj.assignValues();
		//obj.count_more_than_80();
		//obj.print_in_reverse();
		//obj.print_biggest_number();
		//obj.print_smallest_number();
		obj.linear_search();
		//obj.linear_search2();
	}
	
	private void linear_search2() {
		int[] mark = {99,100,100,85,90};
		String[] subject = {"Tamil","English","Maths","Science","Social"};
		for(int i=0; i<mark.length; i++)
		{
			if(mark[i] ==100)
			{
				System.out.println(subject[i]+" ");
				break;
			}
		}
		
		
	}

	private void linear_search() {
		
		int[] mark = {100,50,100,85,90};
		String[] subject = {"Tamil","English","Maths","Science","Social"};
		int count=0;
		for(int i=0; i<mark.length; i++)
		{
			if(mark[i] ==100)
			{
				System.out.println(subject[i]+" ");
				count++;
			}
			
		}
		System.out.println("Number of subjects with 100 marks "+ count);
		
	}

	private void print_smallest_number() {
		System.out.println("Enter count for the array");
		int count = sc.nextInt();
		arr = new int[count];
		int smallest_number = 2147483647;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter number: ");
			arr[i] = sc.nextInt();
			if(smallest_number>arr[i])
			{
				smallest_number = arr[i];
			}
		}
		System.out.println("Smallest Number is "+smallest_number);
		
	}
	
	
	private void print_in_reverse() {
		System.out.println("Enter count for the array");
		int count = sc.nextInt();
		arr = new int[count];
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter number: ");
			arr[i] = sc.nextInt();
		
		}
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}


	private void print_biggest_number() {
		System.out.println("Enter count for the array");
		int count = sc.nextInt();
		arr = new int[count];
		int biggest_number = 0;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter number: ");
			arr[i] = sc.nextInt();
			if(biggest_number<arr[i])
			{
				biggest_number = arr[i];
			}
		}
		System.out.println("Biggest Number is"+biggest_number);
		
	}

	private void count_more_than_80() {
		System.out.println("Enter Number of Subjects");
		int count = sc.nextInt();
		arr = new int[count];
		for(int i = 0; i<arr.length; i++)
		{
		
			System.out.println("Enter Marks");
			arr[i] = sc.nextInt();
				
		}
		
		for(int i : arr)
		{
			if(i>80)
				System.out.print(i+ " ");
		}
	}

	void assignValues()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter Number of Subjects");
		int subjectsCount = sc.nextInt();
		arr = new int[subjectsCount];
		
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.print("Enter marks : ");
			arr[i] = sc.nextInt();
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		
	}

}
