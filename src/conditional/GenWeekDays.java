package conditional;

import java.util.Scanner;

/*Write a Java program that keeps a number from the user and generates an integer
between 1 and 7 and displays the name of the weekday.*/
public class GenWeekDays {

	public static void main(String[] args) {

		byte num;
		System.out.println("Enter a Week Day...");
		Scanner sc=new Scanner(System.in);
		num=sc.nextByte();
		if(num==1)
		{
			System.out.println("Sunday");
		}
		else if(num==2)
		{
			System.out.println("Monday");
		}
		else if(num==3)
		{
			System.out.println("Tuesday");
		}
		else if(num==4)
		{
			System.out.println("Wednesday");
		}
		else if(num==5)
		{
			System.out.println("Thursday");
		}
		else if(num==6)
		{
			System.out.println("Friday");
		}
		else if(num==7)
		{
			System.out.println("Saturday");
		}
		else {
			System.out.println("There are only 7 Days in a Week");
		}
	}
		

}
