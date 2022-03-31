package chapter1;
import java.util.*;
public class PowerOf {

	public static void main(String[] args) {
		
		double n,m;
Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter values to find Power..");
			System.out.println("Enter 0 ,0 to quit..");
			n=sc.nextDouble();
			m=sc.nextDouble();
			
			double r=Math.pow(n, m);
					System.out.println("Result="+r);
					if(n==0 && m==0)
					{
						System.out.println("Thank You ");
						break;
					}
			}while(!(m==0 && n==0));
	}	
}
