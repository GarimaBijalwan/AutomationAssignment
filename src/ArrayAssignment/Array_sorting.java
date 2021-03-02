package ArrayAssignment;

import java.util.Scanner;

public class Array_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,i,min,j,temp;
	      Scanner input=new Scanner(System.in);
			
			System.out.println("enter the number of elements");
			number=input.nextInt();
			
			int[] a=new int[number];
			
			System.out.println("enter the elements of array");
			
			for(i=0;i<number;i++)			
				a[i]=input.nextInt();
			
		System.out.println("Unsorted array is");
		for(int b:a)
			System.out.print("  "+b);
		
		for(i=0;i<number;i++)
		{
			min=i;
			for(j=i;j<number;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			
			if(min!=i)
			{
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		
		System.out.println("\n\nSorted array is");
		for(int b:a)
			System.out.print("  "+b);
			
	}

}
