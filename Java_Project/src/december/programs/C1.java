package december.programs;

public class C1 extends P1{
	
	public int no = 6;
	
		public static void main(String[] args)
		{
			C1 cObj = new C1();
			cObj.studying();
			cObj.working();
			System.out.println(cObj.no);
				
			
			P1 pObj = new P1();
			pObj.working();
			System.out.println(pObj.no);
			
			P1 p1 = new C1();
			p1.working();
			System.out.println(p1.no);
			
			C1 c1 = (C1) p1;
			c1.working();
			c1.studying();
			System.out.println(c1.no);
			
			
		
		}
		
		
		
		public void studying()
		{
			System.out.println("Studying");
		}

}