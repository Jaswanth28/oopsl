package exp1;

import java.util.*;

class area
{
	void ar(int a)
	{
		if(a==1)
		{
			System.out.println("CALCULATING CIRCLE AREA....");
		}
		if(a==2)
		{
			System.out.println("CALCULATING RECTANGLE......");	
		}
	}
}

class ars extends area
{
	void asr(int b)
	{
		if(b==1)
		{
			double pi=3.14;
			System.out.println("enter the radius of circle");
			Scanner d=new Scanner(System.in);
			int r=d.nextInt();
			double q=pi*r*r;
			System.out.println("area of circle is"+q);
		}
		if(b==2)
		{
			System.out.println("enter the length of rectangle");
			Scanner d=new Scanner(System.in);
			int l=d.nextInt();
			System.out.println("enter the length of rectangle");
			Scanner f=new Scanner(System.in);
			int o=f.nextInt();
			int p=o*l;
			System.out.println("area of rectangle is"+p);
		}
	}
}
public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.circle");
		System.out.println("2.rectangle");
		System.out.println("enter the choice");
		Scanner h=new Scanner(System.in);
		int m=h.nextInt();
		if(m==1)
		{
			ars k=new ars();
			k.ar(m);
			k.asr(m);
		}
		if(m==2)
		{
			ars k=new ars();
			k.ar(m);
			k.asr(m);
		}
	}

}
