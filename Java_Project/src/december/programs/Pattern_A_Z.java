package december.programs;

public class Pattern_A_Z {

	public static void main(String[] args) {
		
		Pattern_A_Z obj = new Pattern_A_Z();
		obj.print_A();
		System.out.println("----------------------------------------");
		obj.print_B();
		System.out.println("----------------------------------------");
		obj.print_C();
		System.out.println("----------------------------------------");
		obj.print_D();
		System.out.println("----------------------------------------");
		obj.print_E();
		System.out.println("----------------------------------------");
		obj.print_F();
		System.out.println("----------------------------------------");
		obj.print_G();
		System.out.println("----------------------------------------");
		obj.print_H();
		System.out.println("----------------------------------------");
		obj.print_I();
		System.out.println("----------------------------------------");
		obj.print_J();
		System.out.println("----------------------------------------");
		obj.print_K();
		System.out.println("----------------------------------------");
		obj.print_L();
		System.out.println("----------------------------------------");
		obj.print_M();
		System.out.println("----------------------------------------");	
		obj.print_N();
		System.out.println("----------------------------------------");
		obj.print_O();
		System.out.println("----------------------------------------");	
		obj.print_P();
		System.out.println("----------------------------------------");	
		obj.print_Q();
		System.out.println("----------------------------------------");
		obj.print_R();
		System.out.println("----------------------------------------");	
		obj.print_S();
		System.out.println("----------------------------------------");
		obj.print_T();
		System.out.println("----------------------------------------");
		obj.print_U();
		System.out.println("----------------------------------------");
		obj.print_V();
		System.out.println("----------------------------------------");
		obj.print_W();
		System.out.println("----------------------------------------");
		obj.print_X();
		System.out.println("----------------------------------------");
		obj.print_Y();
		System.out.println("----------------------------------------");
		obj.print_Y_2();
		System.out.println("----------------------------------------");
		obj.print_Z();
		System.out.println("----------------------------------------");
		
		
	
	}
	
	public void print_Z() {
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row == 1 || row == 9)
					System.out.print("* ");
				else if(col+row == 10)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public void print_Y_2() {
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == row && col<= 5)
					System.out.print("* ");
				else if(col+row ==10 && col> 5)
					System.out.print("* ");
				else if(col ==5 && row>=5)
					System.out.print("* ");
					
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	
	
	public void print_Y() {
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == row && col<= 5)
					System.out.print("* ");
				else if(col+row ==10)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.println();
			
		}
	
	}
	
	public void print_X() {
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == row)
					System.out.print("* ");
				else if(col+row ==10)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.println();
			
		}
		
	}
	
	public void print_W() {
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == 1 || col == 9)
					System.out.print("* ");
				else if(col+row == 10 && row>=5)
					System.out.print("* ");
				else if(col == row && row>=5)
					System.out.print("* ");
					
				else
					System.out.print("  ");
			}
			System.out.println("");
			
		}
		
	}
	
	public void print_V() {
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 18; col++)
			{
				if( col == row )
					System.out.print("* ");
				else if(row+col == 18)
					System.out.print("* ");
				else
					System.out.print("  ");
			
			}
			System.out.println("");
			
		}
		
	}
	
	public void print_U() {
	for(int row = 1; row<= 9; row++)
	{
		for(int col =1; col<= 9; col++)
		{
			if(col == 1 || col == 9)
			{
				if(row == 9)
				
					System.out.print("  ");
				
				else
					System.out.print("* ");
			}
				else if (row == 9)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
		System.out.println("");
			
		}
		
	}

	
	
	public void print_T()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row == 1 || col == 5)
					
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
	
	public void print_S()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				
				if(row ==1 || row == 9 || row ==5)
					System.out.print("* ");
				else if(col == 1 && row <5)
					System.out.print("* ");
				else if(col == 9 && row>5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
	
	public void print_R()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 5; col++)
			{
				if(col == 1)
					System.out.print("* ");
				else if(row == 1)
					System.out.print("* ");
				else if(row == 5)
					System.out.print("* ");
				else if(col == 5 && row <= 5)
					System.out.print("* ");
				else if(row>5 && (row - col) == 4)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println("");
		}
	}
	
	public void print_Q()
	{
		for(int row = 1; row<= 10; row++)
		{
			for(int col =1; col<= 10; col++)
			{
				if(col <=9 && row <= 9 && (row ==1 || row == 9 || col == 1 || col ==9 ))
				{
					if(row == 1 && (col == 1 || col == 9))
						System.out.print("  ");
					else if(row == 9 && col == 1)
						System.out.print("  ");
					else	
					System.out.print("* ");
				}
				else if (row == 10 && col == 10)
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			System.out.println("");
		}
	}
	
	public void print_P()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == 1 || row == 1 || row == 5)
				{
						System.out.print("* ");

				}
				else if(col ==9 && row <= 5)
					System.out.print("* ");
				else
					System.out.print("  ");
					
				
			}
			System.out.println("");
		}
	}
	
	public void print_O()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				
				if(row == 1 || row == 9)
				{
					if(col == 1 || col == 9)
						System.out.print("  ");
					else
						System.out.print("* ");

				}
				else if(col == 1 || col == 9)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
	public void print_M()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == 1 || col == 9)
				{
					System.out.print("* ");
				}
				else if(row == col && row <=5)
					System.out.print("* ");
				else if(row+col ==10 && row<=5)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println("");
			
		}
		
	}
	
	public void print_N()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == 1 || col == 9)
				{
					System.out.print("* ");
				}
				else if(row == col)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println("");
			
		}
		
	}
	
	public void print_L()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row==9 || col==1)
				{
					System.out.print("* ");
				}
				
			}
			
			System.out.println("");
		}
	}
	
	public void print_K()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col==1)
					System.out.print("* ");
				else if(row+col == 7)
					System.out.print("* ");
				else if(row>5 && row-col == 3)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			
			System.out.println("");
			
		}
	}
	
	public void print_J()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(col == 5 && row<9)
					System.out.print("* ");
				else if(row == 9 && (col <= 5))
					System.out.print("* ");
				else if(row == 1)
					System.out.print("* ");
				else if(row ==8 && col == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.println("");
		
		}
		
	}
	
	public void print_I()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row == 1 || row == 9)
					System.out.print("* ");
				else if(col == 5)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println("");
		}
	}
	
	public void print_H()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				
				if(col==1 || col==9)
					System.out.print("* ");
				else if(row == 5 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.println("");
			
		}
		
			
		
	}
	
	
	public void print_G() {
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row == 1 )
				{
					if(col == 1)
						System.out.print("  ");	
					else
						System.out.print("* ");
				}
				else if(row == 9)
				{
					if(col == 1 || col == 9)
						System.out.print("  ");	
					else
						System.out.print("* ");
				}
				else if(col==1)
					System.out.print("* ");
				else if(col == 9 && row >=5)
					System.out.print("* ");
				else if(row == 5 &&  col>=5)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
				System.out.println("");
		}
		
	}



	public void print_F()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row == 1 || row == 5)
				{
					System.out.print("* ");
				}
				else if(col==1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
				System.out.println("");
		}
	}
	public void print_E()
	{
		
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row == 1 || row == 9)
				{
					if(col==1)
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				else if(row == 5)
					System.out.print("* ");
				else if(col == 1)
			
					System.out.print("* ");
				
				else
					System.out.print("  ");
					
			}
			System.out.println("  ");
					
		}
	}
	
	
	public void print_D()
	{
		for(int row = 1; row<= 9; row++)
		{
			for(int col =1; col<= 9; col++)
			{
				if(row == 1 || row == 9)
				{
					if(col ==9 )
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				else if(col == 1 || col == 9)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println("  ");
		}
	}
	
	public void print_C()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col =1 ; col<=9; col++)
			{
				if(row == 1 || row == 9)
				{
					if(col == 1)
						System.out.print(" ");
					else
						System.out.print("* ");
				}
				else if(col == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			
			System.out.println("  ");
		}
	}
	
	
	public void print_B()
	{
		for(int row = 1; row<=9; row++)
		{
			for(int col =1 ; col<=9; col++)
			{
				if (row == 1 || row == 9)
				{
					if(col ==9)
						System.out.print("  ");
					else
						System.out.print("* ");
						
				}
				else if (row == 5)
					System.out.print("* ");
				else if(col == 1 || col == 9)
					System.out.print("* ");
				
				else 
					System.out.print("  ");
			}
			
			System.out.println("");
		}
	}
	

	
	public void print_A()
	{
		
		int row,col;
		for (row=1;row<=9;row++)
		{
			for(col=1;col<=9;col++)
			{
				if(row == 1) 
				{
					if(col == 1 || col == 9)
						System.out.print(" ");
					else
						System.out.print("* ");
				}
				else if(row >=2 && (col ==1 || col == 9) )
					System.out.print("* ");
				else if(row ==5)
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}

}
