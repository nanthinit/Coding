package december.programs;

public class PrintMultiplication {

	public static void main(String[] args) {
		// 1*10 2*9 3*8 4*7
		
		PrintMultiplication obj = new PrintMultiplication();
		obj.print_multiply(1, 10);

	}
	
	public void print_multiply(int first, int last)
	{
		while(first < last)
		{
			System.out.println(first+" * "+last+" = "+(first*last));
			first = first+1;
			last = last-1;
		}
		
	}

}
