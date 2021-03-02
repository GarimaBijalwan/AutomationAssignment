package if_else_assignment;

import java.util.Scanner;

public class Max_of_three_numbers {

public static void main(String[] args) {
		
		int num1,num2, num3,max;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter 1st number");
		num1=input.nextInt();
		
		System.out.println("enter 2nd number");
		num2=input.nextInt();
		
		System.out.println("enter 2nd number");
		num3=input.nextInt();

		if(num1>num2)
		{
			if(num1>num3)
				max=num1;
			else
				max=num3;
		}
			
		else
		{
			if(num2>num3)
				max=num2;
			else
				max=num3;
		}
			System.out.println("Maximum number is  "+max);
	}
}
