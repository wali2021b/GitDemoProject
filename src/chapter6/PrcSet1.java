package chapter6;
import java.util.*;
public class PrcSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float[] prices=new float[5];

System.out.println("enter five float elemetns in the array..");
Scanner sc=new Scanner(System.in);
for(int i=0;i<prices.length;i++)
{
	prices[i]=sc.nextFloat();
}


float sum=0;
for(float elem:prices)
{
	sum+=elem;
}
System.out.println("some of the given arry elements is : "+sum);
	}

}
