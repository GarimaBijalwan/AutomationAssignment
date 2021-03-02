package Loop_with_Logic;

import java.util.Scanner;

public class Factorial_value {

	public static void main(String[] args) {
		
		int number,i,num;
		Scanner input=new Scanner(System.in);
		System.out.println("enter any number");
		number=input.nextInt();
		num=number;
		for(i=number-1;i>0;i--)
			number=number*i;
		
		System.out.println("factorial of "+num+" is =  "+number);
	}

}
