package december.programs;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		
		Binary_to_Decimal obj = new Binary_to_Decimal();
		obj.binary_to_decimal(1011);
	}

	
	void binary_to_decimal(int no)
	{
		int dec=0;
		int i = 0;
		while(no>0)
		{
			dec = dec+ ((no%10)*find_power(2,i));
			no=no/10;
			i = i+1;
		}
		
		System.out.println(dec);
		
	}
	
	int find_power(int no, int power)
	{
		int result = 1;
		int i = 1;
		while(i<=power)
		{
		result = result*no;
		i = i+1;
		}
		return result;
	}
}
