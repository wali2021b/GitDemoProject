package chapter6;

//Write a Java program to find the duplicate values of an array of string values.
public class DuplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] names= {"Sayyed","Zaid","Sayyed","Java","Anas","Aasu","Java","zaid"};
System.out.println("Duplicate Names in the array are: ...");
for(int i=0;i<names.length;i++)
{
	for(int j=i+1;j<names.length;j++)
	{
		if(names[i].equalsIgnoreCase(names[j])) {
			System.out.println(names[i]);
		}
	}
}
	}

}
