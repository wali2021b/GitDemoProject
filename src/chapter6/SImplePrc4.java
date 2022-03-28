package chapter6;

import java.util.Scanner;

public class SImplePrc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a=new int[2][3];
		int[][] b=new int[2][3];
		int[][] c=new int[2][3];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values of first Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values of Second Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=sc.nextInt();
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
System.out.println("Addition of the matrix A & B is : ");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(c[i][j]+"\t");
		
	}
	System.out.println();
}
	}

}
