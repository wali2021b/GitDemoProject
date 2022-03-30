package chapter6;

import java.util.*;

public class SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {3,44,5,66,7,90,6};
String[] name= {"Sayyed","Altaf","Zaid","Farhan"};
System.out.println("Actual Array is : "+Arrays.toString(a));
Arrays.sort(a);                                                  
System.out.println("NOw Sortted Array is.."+Arrays.toString(a));
 
System.out.println(Arrays.toString(name));
Arrays.sort(name);
System.out.println("Sorted Names are.. : "+Arrays.toString(name));

	}

}
