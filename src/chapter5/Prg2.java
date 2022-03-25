package chapter5;
import java.util.*;
public class Prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  sum of first n even numbers...    0+2+3+4+......+n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How many Numbers sum do you want to print.");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum +=i*2;
			System.out.print("\t"+i*2);
		}
		System.out.println("\nSum of the Even numbers is.."+sum);
	}

}
