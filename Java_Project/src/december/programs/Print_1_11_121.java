package december.programs;

public class Print_1_11_121 {

	public static void main(String[] args) {
		
		Print_1_11_121 obj = new Print_1_11_121();
		obj.print_1_11_121(4);
	}
	
	void print_1_11_121(int no)
	{
		int count = 1;
		while(no>0)
		{
			System.out.println(count);
			count = count*11;
			no = no - 1 ;
		}
	}

}
