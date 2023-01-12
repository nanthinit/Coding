package december.programs;

public class Print_Number_Pattern {

	public static void main(String[] args) {

		Print_Number_Pattern obj = new Print_Number_Pattern();
//		obj.print_1();
//		System.out.println("..........................");
//		obj.print_2();
//		System.out.println("..........................");
//		obj.print_3();
//		System.out.println("..........................");
//		obj.print_4();
//		System.out.println("..........................");
//		obj.print_5();
//		System.out.println("..........................");
//		obj.print_6();
//		System.out.println("..........................");
//		obj.print_7();
//		System.out.println("..........................");
//		obj.print_8();
//		System.out.println("..........................");
//		obj.print_9();
//		System.out.println("..........................");
//		obj.print_10();
//		System.out.println("..........................");
//		obj.print_11();
//		System.out.println("..........................");
//		obj.print_12();
//		System.out.println("..........................");
//		obj.print_13();
//		System.out.println("..........................");
//		obj.print_14();
//		System.out.println("..........................");
//		obj.print_15();
//		System.out.println("..........................");
//		obj.print_16();
//		System.out.println("..........................");
//		obj.print_17();
//		System.out.println("..........................");
//		obj.print_18();
//		System.out.println("..........................");
//		obj.print_19();
//		System.out.println("..........................");
		obj.print_20();
		
	}
	
	public void print_20()
	{
		for(int row = 1; row<=14; row++)
		{
			for(int col = 1; col <= 13; col++)
			{
				if(row+col ==8 || col-row== 6)
					System.out.print("*");
				else if(row>=8 && (row-col ==7 || row+col == 21))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
		}
		
		
	}
	
	public void print_19()
	{
		for(int row = 1; row<=10; row++)
		{
			for(int col = 1; col <= 20; col++)
			{
			
				if(col+row >10 && col+row<20)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();		
			
		}
		
	}
	
	public void print_18()
	{
		for(int row = 1; row<11; row=row+2)
		{
			for(int col = 1; col <= row; col++)
				
			{
				System.out.print(col+" ");
				
			}
			System.out.println();
			
		}
	}
	
	public void print_17()
	{
		for(char row = 'A'; row<= 'E'; row++)
		{
		
			for(char col = 'E'; col>= row; col--)
			{
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
		
	}
	
	public void print_16()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print("  ");
					
			}
			for(int col = 5; col>=row;col--)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		System.out.println("....................");
		
		for(int row = 1; row<=5; row++)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print("  ");
					
			}
			for(int col = 1; col<=6-row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		System.out.println("....................");
		
		for(int row = 1; row<=5; row++)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print("  ");
					
			}
			for(int col = 1; col<=6-row;col++)
			{
				System.out.print(col+"   ");
			}
			System.out.println();
		}
		
	}
	
	public void print_15()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5-row; col>=1; col--)
			{
				System.out.print("  ");
					
			}
			for(int col = 1; col<=row; col++)
			{
			System.out.print(row*col+"   ");
			}
			System.out.println();
		}
		
	}
	
	public void print_14()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5-row; col>=1; col--)
			{
				System.out.print("  ");
					
			}
			for(int col = 1; col<=row; col++)
			{
			System.out.print(row+"   ");
			}
			System.out.println();
		}
		
	}
	
	
	public void print_13()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5-row; col>=1; col--)
			{
				System.out.print("  ");
					
			}
			for(int col = 1; col<=row; col++)
			{
			System.out.print(col+"   ");
			}
			System.out.println();
		}
		
	}
	
	
	public void print_12()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5-row; col>=1; col--)
			{
				System.out.print("  ");
					
			}
			for(int col = 1; col<=row; col++)
			{
			System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	
	public void print_11()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5-row; col>=1; col--)
			{
				System.out.print("* ");
					
			}
			for(int col = 1; col<=row; col++)
			{
			System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	
	public void print_10()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5-row; col>=1; col--)
			{
				System.out.print("* ");
					
			}
			System.out.print("1 ");
			System.out.println();
		}
		
	}
	
	public void print_9()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5-row; col>=1; col--)
			{
				System.out.print("* ");
					
			}
			System.out.println();
		}
		
	}
	
	public void print_8()
	{
		int i = 1;
		for(int row = 5; row>=1; row--)
		{
			for(int col = 1; col<=row; col++)
			{
				
				System.out.print(i+" ");
				i = i+1;
				
			}
			
			System.out.println();
		}
		
	}
	
	public void print_7()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = row; col<=5; col++)
			{
				System.out.print(col+" ");
				
			}
			
			System.out.println();
		}
		
	}
	
	public void print_6()
	{
		for(int row = 5; row>=1; row--)
		{
			for(int col = 1; col<=row; col++)
			{
				System.out.print(row+" ");
				
			}
			
			System.out.println();
		}
		
	}
	
	public void print_5()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 5; col>=row; col--)
			{
				System.out.print(col+" ");
				
			}
			
			System.out.println();
		}
		
	}
	
	
	public void print_4()
	{
		for(int row = 1; row<=5; row++)
		{
			for(int col = 1; col<=row; col++)
			{
				System.out.print(col+" ");
				
			}
			
			System.out.println();
		}
		
	}
	
	public void print_3()
	{
		for(int row = 5; row>=1; row--)
		{
			for(int col = 1; col<=row; col++)
			{
				System.out.print(col+" ");
				
			}
			
			System.out.println();
		}
		
	}
	
	
	
	public void print_1()
	{
		
		for(int row = 1; row<=5; row++)
		{
			for(int col = 1; col<=5; col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	
	public void print_2()
	{
		
		for(int row = 1; row<=5; row++)
		{
			for(int col = 1; col<=5; col++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

}
