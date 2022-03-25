package chapter1;
import java.util.*;
public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[5];
int i=0,sum=0;

//System.out.println("I = "+i);
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Name Please..");
String name=sc.nextLine();
do {
	System.out.println("Enter numbers of "+(i+1)+" Subject.");
	arr[i]=sc.nextInt();
	i++;
	
}while(i<5);
for(i=arr.length-1;i>=0;i--)
{
	sum+=arr[i];
}
float avg=sum/5.0f;
System.out.println("sum is "+sum);

System.out.println("Hey "+name+" You Have Scored : "+avg+"% in the Exam.");

	}

}
