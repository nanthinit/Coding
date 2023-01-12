package december.programs;

public class StrongNumber {
	
	public static void main(String[] args)
	{
		
		int no = 145;
		StrongNumber obj = new StrongNumber();
		obj.find_strongnumber(no,1);
		obj.find_all_strong_no();
		
	}
	
	void find_all_strong_no()
	{
		
		int i = 1;
		while(i<1000000)
		{
			find_strongnumber(i,2);
			i = i+1;
		}
		
		
	}
	
	void find_strongnumber(int no,int type)
	{
		int origno = no;
		int sum = 0;
		while(no>0)
		{
			sum = sum+find_factorial(no%10);
			no = no/10;
			
		}
		if(type ==1)
		System.out.println(origno==sum?"Strong Number "+sum:"Not Strong Number "+sum);
		else
		{
			if(origno==sum)
				System.out.println("Strong Number : "+ origno);
		}
	}

	int find_factorial(int no)
	{
		
		int fact = 1;
		while(no>0)
		{
			
			fact = fact * no;
			no = no-1;
		}
		//System.out.println(fact);
		return fact;
		
	}
}
