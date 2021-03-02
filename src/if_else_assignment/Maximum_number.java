package if_else_assignment;

import java.util.Scanner;

public class Maximum_number {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter 1st number");
		num1=input.nextInt();
		
		System.out.println("enter 2nd number");
		num2=input.nextInt();

		if(num1>num2)
			System.out.println(num1+" is maximum number");
		else
			System.out.println(num2+" is maximum number");
	}

}
