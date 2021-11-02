package week2;

import java.util.*;

public class fact2 {

	public static void main(String[] args) {
		System.out.println("enter the value to find the facorial");
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		
		int f=1,i=1;
		while(i<=a)
		{
			f=f*i;
			i++;
		}
		b.close();
		System.out.println(f);
		
		

	}

}
