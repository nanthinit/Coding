package december.programs;

public class Print_1_4_27_256 {

	public static void main(String[] args) {
		Print_1_4_27_256 obj =new Print_1_4_27_256();
		obj.print_1_4_27_256(5);
	}
	
	void print_1_4_27_256(int no)
	{
		int i =1;
		while(i<=no)
		{
			find_power(i,i);
			i = i+1;
		}
		
	}
	
	void find_power(int no, int power)
	{
		int i = 1;
		int result=1;
		while(i<=power)
		{
			result = result*no;
			i = i+1;
		}
		
		System.out.println(result);
	}

}
