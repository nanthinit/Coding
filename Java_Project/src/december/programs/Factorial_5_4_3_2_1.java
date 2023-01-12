package december.programs;

public class Factorial_5_4_3_2_1 {

	public static void main(String[] args) {
		
		Factorial_5_4_3_2_1 obj = new Factorial_5_4_3_2_1();
		obj.find_fact(5);

	}
	public void find_fact(int no)
	{
		int fact = 1;
		int origno = no;
		while(no>0)
		{
			fact = fact*no;
			no = no-1;
			
		}
		
		System.out.println("Factorial of "+origno +" is "+fact);
		origno = origno -1;
		if(origno>0)
			find_fact(origno);
			
	}
}
