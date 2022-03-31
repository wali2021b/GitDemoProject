package conditional;
import java.util.Scanner;
//Write a Java program that reads a floating-point number and prints "zero" if the
//number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute
//value of the number is less than 1, or "large" if it exceeds 1,000,000.
public class AbsoluteValue {

	public static void main(String[] args) {

		float num;
		System.out.println("Enter a number...");
		Scanner sc=new Scanner(System.in);
		num=sc.nextFloat();
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num>=1_000_000)
			
		{
			System.out.println("Large Number");
		}
else if(num<1 && num>0)
			
		{
			System.out.println("Let's Consider it One.");
		}
else if(num>=1)
	
{
	System.out.println("Positive Number");
}
else if(num<0)
	
{
	System.out.println("Negative Number");
}
else {
	System.out.println("Did not full fill the condition..");
}
	}

}
