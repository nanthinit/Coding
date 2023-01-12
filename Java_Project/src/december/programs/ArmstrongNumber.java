package december.programs;

public class ArmstrongNumber {
	
	//print armstrong number
	//print armstrong number in the given range
	
	public static void main(String[] args)
	{
		
		ArmstrongNumber obj = new ArmstrongNumber();
		System.out.println(obj.armstrong_number_or_not(370));
		obj.print_armstrong_number(999);
		
		
	}
	
	
	public void print_armstrong_number(int max)
	{
		
		while(max>0)
		{
			if( armstrong_number_or_not(max).equals("Armstrong Number"))
					System.out.println(max);
			max = max -1;
		}
	}
	
	public String armstrong_number_or_not(int no)
	{
		int sum = 0;
		int result = no;
		int count = get_digit_count(no);
		
		while(no>0)
		{
			sum = sum+ findPower(no%10,count);
			no = no/10;
			
			
		}
		
		return result == sum?"Armstrong Number":"Not an Armstrong number";
	}
	
	public int get_digit_count(int no)
	{
		int count = 0;
		while(no>0)
		{
			count = count+1;
			no = no/10;
		}
		return count;
		
	}
	
	public int findPower(int no, int power)
	{
		int result = 1;
		
		while(power>0)
		{
			result = result*no;
			power = power-1;
		}
		
		return result;
	}
	

}
