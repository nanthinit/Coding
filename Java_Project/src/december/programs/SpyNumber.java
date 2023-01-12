package december.programs;

public class SpyNumber {

	public static void main(String[] args) {
		
		SpyNumber obj = new SpyNumber();
		obj.find_spynumber(22, 1);
		obj.list_all_spy_numbers();

	}
	
	void list_all_spy_numbers()
	{
		int i = 1;
		while(i<1000)
		{
			find_spynumber(i,2);
			i = i+1;
		}
	}
	
	void find_spynumber(int no,int type)
	{
		int sum = 0;
		int prod = 0;
		sum = this.find_sum_of_all_digits(no);
		prod = this.find_product_of_all_digits(no);
		if(type == 1)
			System.out.println(sum==prod? no+" is a spy number": no+" is not a spy number");
		if(type == 2)
			if(sum==prod)
				System.out.println(no+" is a spy number");
		
	}
	
	int find_sum_of_all_digits(int no)
	{
		int sum = 0;
		while(no>0)
		{
			sum = sum+(no%10);
			no = no/10;
		}
		return sum;
	}
	
	int find_product_of_all_digits(int no)
	{
		int prod = 1;
		while(no>0)
		{
			prod = prod*(no%10);
			no = no/10;
		}
		return prod;
	}


}
