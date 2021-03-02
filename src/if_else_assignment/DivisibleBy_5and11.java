package if_else_assignment;

import java.util.Scanner;

public class DivisibleBy_5and11 {

	public static void main(String[] args)
	{
		int number;
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter any number");
		number=input.nextInt();
		
		if(number%11==0)
			{
			     if(number%5==0)
			            System.out.println(number +" is divisible by 5 and 11");
			     
			     else
						System.out.println(number +" is not divisible by 5 and 11");
	     	}
		
		else
			System.out.println(number +" is not divisible by 5 and 11");

	}

}
