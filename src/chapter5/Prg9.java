package chapter5;
import java.util.*;
public class Prg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter URL of the webpage..");
name=sc.nextLine();
if(name.endsWith(".in"))
{
	System.out.println("Indian Website.");
}
else if(name.endsWith(".org"))
{
	System.out.println("Organisations Websites.");
}
else if(name.endsWith(".com"))
{
	System.out.println("Commercial Websit...");
}
else 
	System.out.println("Evaluating...");

	}

}
