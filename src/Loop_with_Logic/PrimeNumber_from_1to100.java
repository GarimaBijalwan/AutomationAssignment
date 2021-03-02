package Loop_with_Logic;

import java.util.Scanner;

public class PrimeNumber_from_1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,i,j,flag;
	
	System.out.println("Prime numbers between 1 and 100 are \n");
	for(number=2;number<=100;number++)
		{	
		   j=number/2;
		   flag=0;
		   for(i=2;i<=j;i++)
			   if(number%i==0)
			      {
				      flag=1;
				      break;
			      }
		
		   if(flag==0)
			   System.out.print("  "+number);
		}
		
	}

}
