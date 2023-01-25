package december.programs;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		ArrayDemo2 obj = new ArrayDemo2();
		int[] ar1 = {1,2,3,4,5};
		int[] ar2 = {-1,1,-2,2,-3,3,4,5,0,-1,-9};
		int[] ar3 = {01,11,22,33,44,55,66,77,88,99,49,59,69,79};
		
		//obj.find_index(ar1,3);
		//obj.find_negative(ar2);
		//obj.copying_negative(ar2);
		//obj.copying_odd_index(ar3);
		//obj.copying_even_index(ar3);
		obj.copying_reverse(ar3);
	}
	

	
	private void copying_reverse(int[] arr) {
		
		int[] ar2 = new int[arr.length];
		int j = 0;
		
		for(int i = arr.length-1; i>=0; i--)
		{
			ar2[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(ar2));
		
	}



	private void copying_even_index(int[] arr) {

		int[] ar2;
		ar2 = new int[((arr.length-1)/2)];
		System.out.println(ar2.length);
		int j =0;
		
		for(int i=2; i<=arr.length-1;i=i+2)
		{
			ar2[j] = arr[i];
			j++;

		}

		for(int i : ar2)
			System.out.print(i+" ");

		System.out.println();
		System.out.println(Arrays.toString(ar2));
		
	}



	private void copying_odd_index(int[] arr) {
	
		int[] ar2;
			ar2 = new int[(arr.length/2)];
		System.out.println(ar2.length);
		int j =0;
		for(int i=1; i<=arr.length-1;i=i+2)
		{
			ar2[j] = arr[i];
			j++;
			
		}
		
		for(int i : ar2)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println(Arrays.toString(ar2));
		
		
	}



	void find_index(int[] arr, int no)
	{
		for(int i=0; i<=arr.length-1;i++)
		{
			if(arr[i] == no)
			{
				System.out.println("Index of the given number "+ arr[i]+ " is "+ i);
				break;
			}
		}
		
	}
	
	void find_negative(int[] arr)
	{
		for(int i =0; i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	void copying_negative(int[] arr)
	{
		int count = 0;
		int[] copy_arr;
		for(int i =0; i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}
		
		copy_arr = new int[count];
		int j = 0;
		for(int i =0; i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				copy_arr[j] = arr[i];
				j++;
			}
			
		}
		for(int i : copy_arr)
		System.out.print(i+" ");
		
	}
}
