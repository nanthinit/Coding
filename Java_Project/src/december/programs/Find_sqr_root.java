package december.programs;

public class Find_sqr_root {

	public static void main(String[] args) {
		Find_sqr_root obj = new Find_sqr_root();
		obj.find_sqr_root(25);

	}
	
	void find_sqr_root(int no)
	{
		int i = 2;
		while(true)
		{
			 if(no/i ==i && no%i==0)
			 {
				 System.out.println(i);
				 break;
			 }
				 i=i+1;
		}
	}

}

