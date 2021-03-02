package Loop_with_Logic;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,f,s,t,i;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter number of terms in series");
		number=input.nextInt();
		
		f=0;
		s=1;
		t=f+s;
		System.out.print(f+"  "+s);
		for(i=1;i<=number-2;i++)
		{
			System.out.print("  "+t);
			f=s;
			s=t;
			t=f+s;
		}
	}

}
