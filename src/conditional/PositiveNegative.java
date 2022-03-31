package conditional;
//1. Write a Java program to get a number from the user and print whether it is positive
//or negative.
import java.util.*;

public class PositiveNegative {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check positive and negative..");
		float a=sc.nextFloat();
		if(a>0)
		{
			System.out.println("Entered number is positive ");
		}
		else
		{
			System.out.println("Entered number is Negative");
		}
	}

}
