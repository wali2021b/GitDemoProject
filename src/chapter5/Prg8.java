package chapter5;

import java.util.Scanner;

public class Prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CBSC Results calculator.. if marks>33 each subject and avg > 40 then only pass
		Scanner sc= new Scanner(System.in);
		System.out.println("Inter Marks of three Subjects..");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.printf("Average is :%d",avg);
		System.out.println("%");
		if(m1>33 && m2>33 && m3>33 && avg >40)
		{
			System.out.println("Congratulations You have promoted.");
		}
		else
		{
			System.out.println("OOPs!  You are failed.");
		}
	
	}

}
