package december.programs;

public class Print_Numbers {
	
	public static void main(String[] args)
	{
		Print_Numbers obj = new Print_Numbers();
		obj.print_1();
		System.out.println("----------------------------------------");
		obj.print_2();
		System.out.println("----------------------------------------");
		obj.print_3();
		System.out.println("----------------------------------------");
		obj.print_4();
		System.out.println("----------------------------------------");
		obj.print_5();
		System.out.println("----------------------------------------");
		obj.print_6();
		System.out.println("----------------------------------------");
		obj.print_7();
		System.out.println("----------------------------------------");
		obj.print_8();
		System.out.println("----------------------------------------");
		obj.print_9();
		System.out.println("----------------------------------------");
		obj.print_10();
		System.out.println("----------------------------------------");
		
	}
	public void print_10()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(col == 1 || col == 3 || col == 9)
					System.out.print("* ");
				else if((row == 1 || row == 9) && col >3) 
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	public void print_9()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(row == 1 || col ==9 || row == 5)
					System.out.print("* ");
				else if(col ==1 && row <5)
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	
	public void print_8()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(row == 1 || row ==5 || row ==9 || col ==1 || col ==9)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void print_7()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				
				if(row == 1)
					System.out.print("* ");
				else if(col+row ==10)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public void print_6()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(row == 1 || row == 9 || row == 5 || col == 1)
					System.out.print("* ");
				else if( col ==9 && row >5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public void print_5()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(row == 1 || row == 5 || row == 9)
					System.out.print("* ");
				else if(col ==1 && row <5)
					System.out.print("* ");
				else if(col ==9 && row >5)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	
	public void print_4()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(row == 7 || col == 7)
					System.out.print("* ");
				else if(col+row == 8)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		
	}
	public void print_3()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(row == 1 || row == 9 || row ==5)
					System.out.print("* ");
				else if(col ==9)
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	
	public void print_2()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(row == 1 || row == 9 || row ==5)
					System.out.print("* ");
				else if(col ==9 && row <5)
					System.out.print("* ");
				else if(col ==1 && row >5)
					System.out.print("* ");
				else
					System.out.print("  ");
			
			}
			System.out.println();
		}
	}
	
	public void print_1()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col = 1;  col<=9; col++)
			{
				if(col == 5)
					System.out.print("* ");
				else if(row == 9 && col>=3 && col <= 7)
					System.out.print("* ");
				else if(col+row == 6 && row <=3)
					System.out.print("* ");
				else
					System.out.print("  ");
			
			}
			System.out.println();
		}
		
	}

}
