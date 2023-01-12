package december.programs;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		System.out.println(obj.palindrome(1256521));

	}

	private String palindrome(int no) {
		
		int result=0;
		int init_no = no;
		while(no>0)
		{
			
			result = (result*10)+(no%10);
			no = no/10;
		}
		
		return init_no==result?"Palindrome":"Not Palindrome";
		
	}
	

}
