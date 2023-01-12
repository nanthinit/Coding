package december.programs;

public class NeonNumber {
	


	public static void main(String[] args) {

		int i = 12;
		NeonNumber obj = new NeonNumber();
		int result = obj.neon_or_not(i);
		System.out.println(result==i?i+" is Neon":i+" is not Neon");
		obj.find_all_neon();
	
				
	}
	
	
	void find_all_neon()
	{
	 int i=0;
	 int result;
	 while(i<11)
	 {
		 
		 result = neon_or_not(i);
		 System.out.println(result==i?i+" is Neon":i+" is not Neon");
		 i=i+1;
		 
	 }
	 
	 
	}

	
	int neon_or_not(int no)
	{
		int neon = 0;
		no = no*no;
		
		while(no>0)
		{
			
			neon = neon+(no%10);
			no = no/10;
		}
				
  return neon;
		
	}
	
}
