package conditional;

import java.util.Scanner;

//Take three numbers from the user and print the greatest number.
public class Greatest3 {

	public static void main(String[] args) {

		int a,b,c;
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers to check Greatest..");		
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
		
		if(a==b && b ==c)	
		{
			System.out.println("All The numbers are same..");	
		}
		else if(a>b && a>c)
		{
			System.out.println(a+" : is Greatest ");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" : is Greatest ");
		}
		else
		{
			System.out.println(c+" : is Greatest ");
		}
		
	}

}
