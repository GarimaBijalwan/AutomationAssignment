package Loop_with_Logic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,i,j,flag=0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter any number");
		number=input.nextInt();
		
		 j=number/2;
		for(i=2;i<=j;i++)
			if(number%i==0)
			{
				flag=1;
				break;
			}
		
		if(flag==1)
			System.out.println("\nNumber is not prime");
		else
		    System.out.println("\nNumber is prime");
	}

}
