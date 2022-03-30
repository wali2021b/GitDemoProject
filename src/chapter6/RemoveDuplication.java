package chapter6;

import java.util.Arrays;

//Write a Java program to remove duplicate elements from an array.
public class RemoveDuplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] names= {"Sayyed","Zaid","Sayyed","Java","Anas","Aasu","Java","zaid"};
//System.out.println("Duplicate Names in the array are: ...");
//for(String element:names)
//{
//	System.out.println(element);
//}
System.out.println("Names array is \n=> "+Arrays.toString(names));
for(int i=0;i<names.length;i++)
{
	for(int j=i+1;j<names.length;j++)
	{
		if(names[i].equalsIgnoreCase(names[j])) {
//			System.out.println(names[i]);
			names[j]="";
		}
	}
}
System.out.println("\"Updated\" Names array is \n=> "+Arrays.toString(names));
	}

}
