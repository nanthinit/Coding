package december.programs;

public class Print_1_8_27_64 {

	public static void main(String[] args) {
		
		Print_1_8_27_64 obj = new Print_1_8_27_64();
		obj.print_1_8_27_64(4);
	}
	
	void print_1_8_27_64(int no) {
		int i =1;
		while(i<=no)
		{
			System.out.println(find_power(i,3)); 
			i = i+1;
		}
		
	}
	
	int find_power(int no,int power)
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
