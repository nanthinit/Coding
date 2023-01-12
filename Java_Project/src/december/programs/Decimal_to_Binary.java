package december.programs;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Decimal_to_Binary obj = new Decimal_to_Binary();
		obj.decimal_to_binary(11);
		
	}
	
	void decimal_to_binary(int no)

	{
		String bina = "";
		while(no>0)
		{
			bina = no%2+bina;
			
			
			no = no/2;
		}
		System.out.println(bina);
		
	}
}
