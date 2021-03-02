package if_else_assignment;

import java.util.Scanner;

public class Positive_negative_check {

	public static void main(String[] args)
	{
		
		int number;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter any number");
		number=input.nextInt();
		
		if(number==0)
			System.out.println(number +" is an zero");
		
		else if(number>0)
			System.out.println(number +" is an positive number");
		
		else
			System.out.println(number +" is an negative number");
	}

}
