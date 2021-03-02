package ArrayAssignment;

import java.util.Scanner;

public class Number_Search {

	public static void main(String[] args) {
		
      int number,i,value,j=-1;
      Scanner input=new Scanner(System.in);
		
		System.out.println("enter the number of elements");
		number=input.nextInt();
		
		int[] a=new int[number];
		
		System.out.println("enter the elements of array");
		
		for(i=0;i<number;i++)			
			a[i]=input.nextInt();
		
		System.out.println("enter the value to search");
		value=input.nextInt();
		
		for(i=0;i<number;i++)
			if(value==a[i])
			{
				j=i;
				break;
			}
		
		if(i==number)
			System.out.println(value+ " is not present in array");
		else
			System.out.println(value+ " is fount at "+(j+1)+" position");
	}

}
