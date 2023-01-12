package december.programs;

public class String_Doubt {
	
	String s1;
	public static void main(String args[])
	{
		
		String_Doubt obj=new String_Doubt();
		obj.s1 ="hello";
		String_Doubt obj2 = obj.call(obj);
		System.out.println(obj.s1);
		System.out.println(obj2.s1);
				
	}
	

	String_Doubt call( String_Doubt s1)
	{
		s1.s1 = "Kani";
		return s1;
		
	}

}
