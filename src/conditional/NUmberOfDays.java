package conditional;
//Write a Java program to find the number of days in a month.
import java.util.*;
public class NUmberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month Nubmer");
		int month=sc.nextInt();
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days ");
			break;
		case 2:
			System.out.println("28 or 29 Days \"each forth year 29\"");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days ");
			break; 
			default:
			System.out.println("There are only 12 Months in a year. ");
		}
	}

}
