package gradeCheck;

import java.util.Scanner;

public class Main {
	public static void checkGrade(int grade)

	{
	if(grade>50)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
	
	

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the grade");
int marks=sc.nextInt();
checkGrade(marks);
	}

}
