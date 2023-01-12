package december.programs;

public class ReverseNumber {
	
	//Reverse Number
	//Count of given number
	//Sum of digits of given number
	//Sum of digits of given number till single digit
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.reverse_number(1245672);
		System.out.println();
		System.out.print("Count of given number is : "+obj.count_numbers(1245672));
		System.out.println();
		System.out.print("Sum of digits of given number is: "+obj.sum_numbers(12));
		System.out.println();
		System.out.print("Sum of digits of given number till single digit is : "+obj.sum_no_till_single_digit(99));
		

	}

	private int sum_no_till_single_digit(int no) {
		
		
		while(no>9)
		{
			no = sum_numbers(no);
		}
		
		return no;
		
		
	}

	private int sum_numbers(int no) {
		int sum = 0;
		while(no>0)
		{
			sum = sum+(no%10);
			no = no/10;
		}
		
		return sum;
	}

	private int count_numbers(int no) {
	
		int count =0;
		while(no>0)
		{
			
			no = no/10;
			count = count+1;
			
		}
		
		return count;
	}

	private void reverse_number(int no) {
		System.out.print("Reversed values is : ");

		
		while(no>0)
		{
			System.out.print(no%10);
			no = no/10;
			
		}
		
	}

}
