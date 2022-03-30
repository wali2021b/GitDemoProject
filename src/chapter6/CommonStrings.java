package chapter6;
public class CommonStrings {

//Write a Java program to find the common elements between two arrays (string values).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"ss","aa","sm","bb","www","zaid","Physics"};
		String[] b= {"ss","ee","sm","yy","www","nn","sssss","zaid","PHYSICS"};

		System.out.println("Common Strings in the arrays are ...");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i].equalsIgnoreCase(b[j]))
				{
					System.out.print(a[i]+"\t");
				}
			}
		}
	}

}
