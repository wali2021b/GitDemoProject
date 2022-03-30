
//Write a Java program to find the common elements between two arrays.
package chapter6;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,4,5,8,9,0,66};
		int []b= {1,3,5,8,9,99,89,0,66};
System.out.println("Common Values in the arrays are ...");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+"\t");
				}
			}
		}

	}

}
