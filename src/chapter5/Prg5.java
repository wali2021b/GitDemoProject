package chapter5;

import java.util.Scanner;

public class Prg5 {

	public static void main(String[] args) {
//		 factorial of a given number using for Loop.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to find Factorial.");
		int n=sc.nextInt();
	int	fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.printf("Factorial of %d is :%d",n,fact);
		 
		
		
	}
}
