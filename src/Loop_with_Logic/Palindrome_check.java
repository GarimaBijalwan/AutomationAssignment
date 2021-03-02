package Loop_with_Logic;

import java.util.Scanner;

public class Palindrome_check {

	public static void main(String[] args) {
		
		int number,i,num,rm;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter any number");
		number=input.nextInt();
		num=0;
		for(i=number;i>0;i=i/10)
		{
			rm=i%10;
			num=num*10+rm;
		}
 
		if(num==number)
			System.out.println("\nnumber is palindrome");
		else
			System.out.println("\nnumber is not palindrome");
	}

}
