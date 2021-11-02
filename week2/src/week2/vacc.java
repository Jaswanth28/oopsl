package week2;

import java.util.Scanner;

public class vacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the year of birth to check the eligibility");
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		b.close();
		if(2021-a>=18)
		{
			System.out.println("you are eligible for the vaccination");
		}
		else
		{
			System.out.println("you are not eligible for the vaccination");
		}
	}
}
