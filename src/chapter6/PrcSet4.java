package chapter6;
import java.util.*;

public class PrcSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Program to add to matrices of 2x3 ....
		int [][] a=new int[2][3];
		int[][] b=new int[2][3];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values of first Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix is: ");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
//				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
//		second Matrix..
		
		System.out.println("Enter the values of second Matrix");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
//		addition of matrix ....
		int[][]  c=new int[2][3];
		System.out.println("Additon of Matrix is ...");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
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
