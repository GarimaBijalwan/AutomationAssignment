package if_else_assignment;

import java.util.Scanner;

public class Even_Odd_Check {

	public static void main(String[] args) {
		
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("enter any number");
		number=input.nextInt();
		
		if(number%2==0)
			System.out.println(number +" is an even number");
		else
			System.out.println(number +" is an odd number");

	}

}
