package ArrayAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Element_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,i,j;
	      Scanner input=new Scanner(System.in);
			
			System.out.println("enter the number of elements");
			number=input.nextInt();
			
			int[] a=new int[number];
			
			System.out.println("enter the elements of array");
			
			for(i=0;i<number;i++)			
				a[i]=input.nextInt();
			
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for(int b:a)
				if(hm.containsKey(b))
					{
					   j=hm.get(b);
					   hm.replace(b,j, j+1);
					}
				else
					hm.put(b, 1);
					
			for( Entry<Integer, Integer> entry : hm.entrySet() ){
			    System.out.println( entry.getKey() + " => " + entry.getValue()+" time" );
	}

}
}
